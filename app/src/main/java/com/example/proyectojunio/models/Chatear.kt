package com.example.proyectojunio.models

class Chatear {
    constructor()
    constructor(msg: String, email: String, fecha: Long){
        this.mensaje=msg
        this.email=email
        this.fecha=fecha
    }

    var mensaje: String=""
    var email: String=""
    var fecha: Long=0L
}