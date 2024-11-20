package com.example.ejerciciostema4_pm_franciscorequenasanchez

class Ejercicio5Controlinventario(var nombre_producto:String,var precio:Float,var Cantidad:Int) {

    override fun toString(): String {
        return "El nombre del producto es: $nombre_producto, su precio es: $precio y la cantidad es: $Cantidad \n"
    }
}