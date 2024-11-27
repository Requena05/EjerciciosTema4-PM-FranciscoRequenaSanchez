package com.example.ejerciciostema4_pm_franciscorequenasanchez
//Crea la clase circunferencia. El constructor primario recibirá el
//radio de la circunferencia y el secundario recibirá la posición del centro de la
//circunferencia y un punto cualquiera de la misma. Crear el método longitud()
//y sobrecargar el método toString() de forma que muestre toda la info de la
//circunferencia

open class Circunferencia(var radio:Float) {

    constructor(posicion_centro: IntArray=IntArray(2), punto_cualquiera: IntArray=IntArray(2)) : this(3.14f)

    fun longitud():Float{
        return 2*3.14f*radio
    }

    override fun toString(): String {
        return "Circunferencia(radio=$radio)"
    }
}