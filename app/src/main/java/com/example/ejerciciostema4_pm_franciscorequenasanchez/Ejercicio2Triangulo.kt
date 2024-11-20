package com.example.ejerciciostema4_pm_franciscorequenasanchez

//Crear la clase triangulo. Propiedades: longitud de los tres lados, perímetro,
//tipo de triángulo (isósceles, escaleno o equilátero)
class Ejercicio2Triangulo(var lado1:Float, var lado2:Float, var lado3:Float,var perimetro:Float,var tipo:String) {

    fun isrectangulo():Boolean{
        if(lado1*lado1==lado2*lado2+lado3*lado3 || lado2*lado2==lado1*lado1+lado3*lado3 || lado3*lado3==lado1*lado1+lado2*lado2){
            return true
        }
        return false
    }
}




