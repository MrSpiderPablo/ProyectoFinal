package com.example.proyectojunio.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectojunio.databinding.SuperheroesLayoutBinding
import com.example.proyectojunio.models.Superheroes

class SuperheroesViewHolder(v: View): RecyclerView.ViewHolder(v) {

    val binding = SuperheroesLayoutBinding.bind(v)
    fun render(superheroes: Superheroes){
        binding.txtNombre.text=superheroes.nombre
        binding.imageView.setImageResource(superheroes.imagen)
    }

}