package com.example.proyectojunio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectojunio.databinding.ActivityDetallesBinding
import com.example.proyectojunio.models.Superheroes

class DetallesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetallesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetallesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cogeryPintarSupers()
        setRecycler()
    }

    private fun setRecycler() {
        binding.btVolver.setOnClickListener {
            finish()
        }
    }

    private fun cogeryPintarSupers() {
        val datos = intent.extras
        val superheroes = datos?.getSerializable("SUPERHÉROE") as Superheroes

        binding.tvNombre2.text=superheroes.nombre
        binding.imageView2.setImageResource(superheroes.imagen)
        binding.tvNombre.text=superheroes.alias
        binding.tvHistoria.text=superheroes.biografia
        binding.tvInicios.text=superheroes.primeraAparicion
    }
}