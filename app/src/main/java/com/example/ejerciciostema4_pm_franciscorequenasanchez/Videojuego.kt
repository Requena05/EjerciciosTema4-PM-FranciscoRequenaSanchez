package com.example.ejerciciostema4_pm_franciscorequenasanchez

class Videojuego(var nombre:String,var año:Int,var plataforma:String) {

//Crea una función
//que dada una lista de juegos, una año y una plataforma devuelve los juegos de la lista de
//dicho año y plataforma. La función también debe poder usarse especificando solo el año
//o solo la plataforma.

    override fun toString(): String {
        return "Videojuego(nombre='$nombre', año=$año, plataforma='$plataforma')"
    }


}

fun buscar(lista:MutableList<Videojuego>,año:Int?,plataforma:String?) {
    var lista2 = mutableListOf<Videojuego>()

    if(año!=null || plataforma!=null){
        lista.forEach{

            if(año == null){
                if(it.plataforma == plataforma) lista2.add(it)
            }else if(plataforma == null){
                if(it.año == año) lista2.add(it)
            }else{
                if (it.año==año && it.plataforma==plataforma) lista2.add(it)
            }

        }


    }else
        println("Ninguno esta definido")



    println("Lista de videojuegos: ")
    println(lista2)

}