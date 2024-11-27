package com.example.ejerciciostema4_pm_franciscorequenasanchez
//"Ejercicio 15: Crea la clase Círculo que hereda de circunferencia. Tendrá dos\n" +
//"constructores, el primero recibirá el radio y el color del círculo y el segundo\n" +
//"su centro, un punto cualquiera y su color. Crear el método área() y\n" +
//"sobrecargar el método toString() de forma que muestre toda la info de la\n" +
//"circunferencia"

class Circulo (radio:Float, var color:String):Circunferencia(radio) {

    constructor(centro:IntArray, punto_cualquiera:IntArray, color:String):this(3.14f, color)

    fun area():Float{

        return 3.14f*radio*radio
    }

    override fun toString(): String {
        return "Circular(radio=$radio,color=$color)"
    }



}