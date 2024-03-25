package com.example.proyectojunio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import com.example.proyectojunio.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private var email=""
    private var pass=""

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth=Firebase.auth

        setListeners()
    }

    private fun setListeners() {
        binding.btRegistrar.setOnClickListener {
            if (comprobarCampos()){
                registroBasico()
            }
        }
        binding.btLogin.setOnClickListener {
            if (comprobarCampos()){
                loginBasico()
            }
        }
    }

    private fun loginBasico(){
        auth.signInWithEmailAndPassword(email, pass)
            .addOnCompleteListener {
                if (it.isSuccessful){
                    irOpcionesActivity()
                }else{

                }
            }
    }

    private fun registroBasico(){
        auth.createUserWithEmailAndPassword(email, pass)
            .addOnCompleteListener {
                if (it.isSuccessful){
                    loginBasico()
                }else{

                }
            }
            .addOnFailureListener {
                Log.d("REGISTRO", it.message.toString())
            }
    }

    private fun comprobarCampos(): Boolean{
        email=binding.etEmail.text.toString().trim()
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.etEmail.error="Introduce una dirección de email válida"
            return false
        }
        pass=binding.etPassword.text.toString().trim()
        if (pass.length<7){
            binding.etPassword.error="ERROR: La contraseña no debe tener menos de 7 caracteres"
            return false
        }

        return true
    }

    private fun irOpcionesActivity(){
        startActivity(Intent(this, OpcionesActivity::class.java))
    }
}