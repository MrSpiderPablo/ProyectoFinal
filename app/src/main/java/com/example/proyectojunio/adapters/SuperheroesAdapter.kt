package com.example.proyectojunio.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectojunio.R
import com.example.proyectojunio.models.Superheroes

class SuperheroesAdapter(val list: ArrayList<Superheroes>,
    private val onItemClik:(Superheroes)->Unit): RecyclerView.Adapter<SuperheroesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroesViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.superheroes_layout, parent, false)
        return SuperheroesViewHolder(v)
    }

    override fun getItemCount(): Int {

        return list.size
    }

    override fun onBindViewHolder(holder: SuperheroesViewHolder, position: Int) {
        holder.render(list[position], onItemClik)
    }


}