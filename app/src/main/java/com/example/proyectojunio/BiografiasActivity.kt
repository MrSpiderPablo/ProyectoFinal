package com.example.proyectojunio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectojunio.adapters.SuperheroesAdapter
import com.example.proyectojunio.databinding.ActivityBiografiasBinding
import com.example.proyectojunio.models.Superheroes
import com.example.proyectojunio.provider.SuperheroesProvider

class BiografiasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBiografiasBinding
    val lista = SuperheroesProvider.misSuperheroes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBiografiasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setRecycler()
    }

    private fun setRecycler() {
        val layoutManager = LinearLayoutManager(this)
        binding.recView.layoutManager=layoutManager
        binding.recView.adapter=SuperheroesAdapter(lista)
        {superheroes -> mostrarSuperheroe(superheroes) }
    }

    private fun mostrarSuperheroe(superheroes: Superheroes){
        val i = Intent(this, DetallesActivity::class.java).apply {
            putExtra("SUPERHÉROE", superheroes)
        }
        startActivity(i)
    }
}