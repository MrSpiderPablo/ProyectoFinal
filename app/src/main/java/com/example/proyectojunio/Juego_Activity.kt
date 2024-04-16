package com.example.proyectojunio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectojunio.databinding.ActivityJuegoBinding

class Juego_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityJuegoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityJuegoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}