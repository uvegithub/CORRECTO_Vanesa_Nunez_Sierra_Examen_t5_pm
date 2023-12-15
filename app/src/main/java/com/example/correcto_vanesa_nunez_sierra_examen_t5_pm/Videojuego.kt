package com.example.correcto_vanesa_nunez_sierra_examen_t5_pm

class Videojuego(var nombre:String, var plataforma:String, var anio:Int) {

    override fun toString(): String {
        return "nombre: $nombre    plataforma: $plataforma    anio: $anio"
    }
}