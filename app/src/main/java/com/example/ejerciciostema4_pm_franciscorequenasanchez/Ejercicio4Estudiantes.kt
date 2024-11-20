package com.example.ejerciciostema4_pm_franciscorequenasanchez

class Ejercicio4Estudiantes(var nombre:String,var edad:Int,var calificacion:Float) {

    override fun toString(): String {
        return "El nombre es: $nombre, su edad es: $edad y el su nota es: $calificacion \n"
    }
}