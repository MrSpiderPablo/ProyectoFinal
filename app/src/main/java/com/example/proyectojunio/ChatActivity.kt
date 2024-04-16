package com.example.proyectojunio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectojunio.adapters.MensajesAdapter
import com.example.proyectojunio.databinding.ActivityChatBinding
import com.example.proyectojunio.models.Chatear
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase

class ChatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChatBinding
    private var email = ""
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase
    private lateinit var reference: DatabaseReference
    private var listaMensajes = mutableListOf<Chatear>()
    private lateinit var adapter: MensajesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= Firebase.auth
        email=auth.currentUser?.email.toString()
        initDb()
        setRecycler()
        setDbListener()
        setListener()
    }

    private fun setListener() {
        binding.imageView3.setOnClickListener {
            var contenido = binding.edtMensaje.text.toString().trim()
            if (contenido.isNotEmpty()){
                val fecha = System.currentTimeMillis()
                val mensaje = Chatear(contenido, email, fecha)
                reference.child(fecha.toString()).setValue(mensaje)
                    .addOnSuccessListener {
                        binding.edtMensaje.setText("")
                    }
                    .addOnFailureListener {

                    }
            }
        }
    }

    private fun setDbListener() {
        val dbListener = object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                listaMensajes.clear()
                for (data in snapshot.children){
                    val mensaje = data.getValue(Chatear::class.java)
                    if (mensaje != null){
                        listaMensajes.add(mensaje)
                    }else{
                        continue
                    }
                }
                listaMensajes.sortBy { it.fecha }
                adapter.lista=listaMensajes
                adapter.notifyDataSetChanged()
                binding.recView.scrollToPosition(listaMensajes.size-1)
            }

            override fun onCancelled(error: DatabaseError) {

            }

        }
        reference.addValueEventListener(dbListener)
    }

    private fun setRecycler() {
        val linearLayoutManager = LinearLayoutManager(this)
        binding.recView.layoutManager=linearLayoutManager
        adapter=MensajesAdapter(listaMensajes, email)
        binding.recView.adapter=adapter
    }

    private fun initDb() {
        database= FirebaseDatabase.getInstance("https://proyectointegradojunio-default-rtdb.europe-west1.firebasedatabase.app/")
        reference=database.getReference("mensajesAplicación")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_opciones, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.item_cerrar->{
                auth.signOut()
                finish()
            }
            R.id.item_salir->{
                finishAffinity()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}