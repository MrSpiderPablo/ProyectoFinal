package com.example.proyectojunio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.proyectojunio.databinding.ActivityOpcionesBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class OpcionesActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityOpcionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOpcionesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth=Firebase.auth

        setListeners()
        pintarEmail()
    }

    private fun pintarEmail() {
        binding.tvEmail2.text=auth.currentUser?.email.toString()
    }

    private fun setListeners() {
        binding.btBiografias.setOnClickListener {
            irBiografiasActivity()
        }

        binding.btChat.setOnClickListener {
            irChatActivity()
        }

        binding.btCerrar.setOnClickListener {
            auth.signOut()
            finish()
        }

        binding.btJugar.setOnClickListener {
            irJuegoActivity()
        }
    }

    private fun irBiografiasActivity(){
        startActivity(Intent(this, BiografiasActivity::class.java))
    }

    private fun irChatActivity(){
        startActivity(Intent(this, ChatActivity::class.java))
    }

    private fun irJuegoActivity(){
        startActivity(Intent(this, JuegoActivity::class.java))
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