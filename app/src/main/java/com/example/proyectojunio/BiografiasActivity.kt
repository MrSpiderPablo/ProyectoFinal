package com.example.proyectojunio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectojunio.adapters.SuperheroesAdapter
import com.example.proyectojunio.databinding.ActivityBiografiasBinding
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
    }
}