package com.example.correcto_vanesa_nunez_sierra_examen_t5_pm

import kotlin.random.Random

fun filtraJuegos(lista_juegos:MutableList<Videojuego>, anio:Int):MutableList<Videojuego>{
    var res_lista_filtrada:MutableList<Videojuego> = mutableListOf()
    for(juego in lista_juegos){
        if(juego.anio==anio){
            res_lista_filtrada.add(juego)
        }
    }
    return res_lista_filtrada
}

fun mapaJuegos(lista_juegos:MutableList<Videojuego>):MutableMap<String,String>{
    var res_mapa:MutableMap<String,String> = mutableMapOf()
    for(juego in lista_juegos) {
        res_mapa.put(juego.plataforma, juego.nombre)
    }
    return res_mapa
}

fun plataformas(lista_juegos:MutableList<Videojuego>):MutableList<String>{
//    var res_lista_plataformas:MutableList<String> = mutableListOf()
//    for(juego in lista_juegos) {
//        if(res_lista_plataformas.size>0){
//            for(i in 0 until lista_juegos.size){
//                if(res_lista_plataformas[i]!=juego.plataforma){
//                    res_lista_plataformas.add(juego.plataforma)
//                }
//            }
//        }else{
//            res_lista_plataformas.add(juego.plataforma)
//        }
//    }
//    return res_lista_plataformas

//    var res_lista_plataformas:MutableList<String> = mutableListOf()
//    for(juego in lista_juegos) {
//        res_lista_plataformas.add(juego.plataforma)
//    }
//    for (plataforma in res_lista_plataformas) {
//        for(i in 1 until res_lista_plataformas.size){
//            if(res_lista_plataformas[i]==plataforma){
//                res_lista_plataformas.remove(res_lista_plataformas[i])
//            }
//        }
//    }
//
//    return res_lista_plataformas

    var res_lista_plataformas:MutableList<String> = mutableListOf()
    for(juego in lista_juegos) {
        if(!res_lista_plataformas.contains(juego.plataforma)){
            res_lista_plataformas.add(juego.plataforma)
        }
    }
    return res_lista_plataformas
}

fun championsLeague(lista_equiposf:MutableList<Equipo_de_futbol>):String{
    var res_sorteo:String=""
//    for(equipo in lista_equiposf){
//        var equipo1 = lista_equiposf.random(Random(lista_equiposf.size))
//        res_sorteo+="el equipo: "+equipo1
//        lista_equiposf.remove(equipo1)
//        var equipo2 = lista_equiposf.random(Random(lista_equiposf.size))
//        res_sorteo+="se enfrenta a: "+equipo2+"\n"
//        lista_equiposf.remove(equipo2)
//    }
//    return res_sorteo

//    var res_sorteo:String=""
//    var lista_numeros: MutableList<Int> = mutableListOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6)
//    lista_numeros.shuffle()
//    for(equipo in lista_equiposf){
//        when(equipo)
//    }
    return res_sorteo
}


fun main(){
//  Ejercicio2
//    var lista:MutableList<Videojuego> = mutableListOf()
//    var juego1:Videojuego= Videojuego("v1", "online", 2000)
//    var juego2:Videojuego=Videojuego("v2", "online", 2001)
//    var juego3:Videojuego=Videojuego("v3", "cd", 2000)
//    lista.add(juego1)
//    lista.add(juego2)
//    lista.add(juego3)
//    println(filtraJuegos(lista, 2000))

//    Ejercicio3
//    var lista:MutableList<Videojuego> = mutableListOf()
//    var juego1:Videojuego= Videojuego("v1", "online", 2000)
//    var juego2:Videojuego=Videojuego("v2", "online", 2001)
//    var juego3:Videojuego=Videojuego("v3", "cd", 2000)
//    lista.add(juego1)
//    lista.add(juego2)
//    lista.add(juego3)
//    var lista_filtrada:MutableList<Videojuego> = filtraJuegos(lista, 2000)
//    println(mapaJuegos(lista_filtrada))

//    Ejercicio4
//    var lista:MutableList<Videojuego> = mutableListOf()
//    var juego1:Videojuego= Videojuego("v1", "online", 2000)
//    var juego2:Videojuego=Videojuego("v2", "online", 2001)
//    var juego3:Videojuego=Videojuego("v3", "cd", 2000)
//    lista.add(juego1)
//    lista.add(juego2)
//    lista.add(juego3)
//    println(plataformas(lista))

//    Ejercicio 10
    var lista_equipos:MutableList<Equipo_de_futbol> = mutableListOf()
    var equipo1: Equipo_de_futbol = Equipo_de_futbol("e1", "Espana")
    var equipo2: Equipo_de_futbol = Equipo_de_futbol("e2", "Alemania")
    var equipo3: Equipo_de_futbol = Equipo_de_futbol("e3", "Espana")
    var equipo4: Equipo_de_futbol = Equipo_de_futbol("e4", "Inglaterra")
    var equipo5: Equipo_de_futbol = Equipo_de_futbol("e5", "Croacia")
    var equipo6: Equipo_de_futbol = Equipo_de_futbol("e6", "Inglaterra")
    var equipo7: Equipo_de_futbol = Equipo_de_futbol("e7", "Bulgaria")
    var equipo8: Equipo_de_futbol = Equipo_de_futbol("e8", "Alemania")
    var equipo9: Equipo_de_futbol = Equipo_de_futbol("e9", "Finlandia")
    var equipo10: Equipo_de_futbol = Equipo_de_futbol("e10", "Suecia")
    var equipo11: Equipo_de_futbol = Equipo_de_futbol("e11", "Suiza")
    var equipo12: Equipo_de_futbol = Equipo_de_futbol("e12", "Noruega")
    var equipo13: Equipo_de_futbol = Equipo_de_futbol("e13", "Finlandia")
    var equipo14: Equipo_de_futbol = Equipo_de_futbol("e14", "Birmania")
    var equipo15: Equipo_de_futbol = Equipo_de_futbol("e15", "China")
    var equipo16: Equipo_de_futbol = Equipo_de_futbol("e16", "Japon")

    lista_equipos.add(equipo1)
    lista_equipos.add(equipo2)
    lista_equipos.add(equipo3)
    lista_equipos.add(equipo4)
    lista_equipos.add(equipo5)
    lista_equipos.add(equipo6)
    lista_equipos.add(equipo7)
    lista_equipos.add(equipo8)
    lista_equipos.add(equipo9)
    lista_equipos.add(equipo10)
    lista_equipos.add(equipo11)
    lista_equipos.add(equipo12)
    lista_equipos.add(equipo13)
    lista_equipos.add(equipo14)
    lista_equipos.add(equipo15)
    lista_equipos.add(equipo16)

//    Ejercicio 11
    println(championsLeague(lista_equipos))

}