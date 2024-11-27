package com.example.ejerciciostema4_pm_franciscorequenasanchez

class Satelite(var nombre:String,var tipo:String, var masa:Float, var diametro:Float, var rotacion:Float, var traslacion:Float, var distancia:Float, var excentricidad:Float ) {

    override fun toString(): String {
        return "$nombre $tipo $masa $diametro $rotacion $traslacion $distancia $excentricidad"
    }
}