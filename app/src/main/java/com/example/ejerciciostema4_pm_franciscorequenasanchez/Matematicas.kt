package com.example.ejerciciostema4_pm_franciscorequenasanchez

//Ejercicio 16: Clase de matemáticas. Crea una clase Matemáticas con métodos para realizar
//operaciones matemáticas como sumar, restar, multiplicar y dividir. Luego, utiliza esta clase en tu
//programa principal.

class Matematicas(var num1:Float, var num2:Float) {

    fun sumar():Float{
        return num1+num2

    }
    fun restar():Float{
        return num1-num2
        }
    fun multiplicar():Float{
        return num1*num2
    }
    fun dividir():Float{
        return num1/num2
    }
}