package com.example.ejerciciostema4_pm_franciscorequenasanchez

class Videojuego(var nombre:String,var año:Int,var plataforma:String) {

//Crea una función
//que dada una lista de juegos, una año y una plataforma devuelve los juegos de la lista de
//dicho año y plataforma. La función también debe poder usarse especificando solo el año
//o solo la plataforma.
    fun buscar(lista:MutableList<Videojuego>,nombre: String?,año:Int?,plataforma:String?) {
        var lista2 = mutableListOf<Videojuego>()
        if(año!=null && año==Videojuego(nombre="",año, plataforma = "").año){
            lista.forEach{if(it.año==año)lista2.add(Videojuego(it.nombre,it.año,it.plataforma))}
        }
        if(plataforma!=null && plataforma==Videojuego(nombre="",año=0, plataforma).plataforma){
            lista.forEach{if(it.plataforma==plataforma)lista2.add(Videojuego(it.nombre,it.año,it.plataforma))}
        }
        if(nombre!=null && nombre==Videojuego(nombre,año=0, plataforma="").nombre){
            lista.forEach{if(it.nombre==nombre)lista2.add(Videojuego(it.nombre,it.año,it.plataforma))}
        }


        println("Lista de videojuegos: ")
        println(lista2)

    }
    override fun toString(): String {
        return "Videojuego(nombre='$nombre', año=$año, plataforma='$plataforma')"
    }


}