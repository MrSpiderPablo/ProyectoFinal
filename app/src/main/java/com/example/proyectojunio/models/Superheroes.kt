package com.example.proyectojunio.models

import java.io.Serializable

data class Superheroes(
    val nombre: String,
    val alias: String,
    val imagen: Int,
    val biografia: String,
    val primeraAparicion: String

): Serializable
