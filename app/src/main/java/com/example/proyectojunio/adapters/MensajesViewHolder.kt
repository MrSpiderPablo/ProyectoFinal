package com.example.proyectojunio.adapters

import android.icu.text.SimpleDateFormat
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectojunio.R
import com.example.proyectojunio.databinding.MensajesLayoutBinding
import com.example.proyectojunio.models.Chatear
import java.util.Date

class MensajesViewHolder(v: View): RecyclerView.ViewHolder(v) {

    private val binding=MensajesLayoutBinding.bind(v)
    fun render(mensaje: Chatear, email: String){

        if (email.equals(mensaje.email)){
            binding.clayout.setBackgroundColor(binding.clayout.context.getColor(R.color.propietario))
        }else{
            binding.clayout.setBackgroundColor(binding.clayout.context.getColor(R.color.usuarios))
        }

        binding.tvMensaje.text=mensaje.mensaje
        binding.tvEmail.text=mensaje.email
        binding.tvFecha.text=fechaBuena(mensaje.fecha)
    }

    private fun fechaBuena(fecha: Long): String{

        val date = Date(fecha)
        val format = SimpleDateFormat("HH:mm:ss dd/MM/YYYY")
        return format.format(date)
    }
}