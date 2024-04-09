package com.example.proyectojunio.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectojunio.R
import com.example.proyectojunio.models.Chatear

class MensajesAdapter(var lista: MutableList<Chatear>, private val email: String): RecyclerView.Adapter<MensajesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensajesViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.mensajes_layout, parent, false)
        return MensajesViewHolder(v)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: MensajesViewHolder, position: Int) {
        holder.render(lista[position], email)
    }


}