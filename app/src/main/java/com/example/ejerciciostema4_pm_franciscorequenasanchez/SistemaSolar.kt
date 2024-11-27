package com.example.ejerciciostema4_pm_franciscorequenasanchez

class SistemaSolar(var lista:MutableList<Any>){
    override fun toString(): String {
        return super.toString()
    }

    fun mostrarPlanetas(){
        for (Astros in lista){
            when(Astros){
                is Planeta -> println(Astros)
                is Satelite -> println(Astros)
            }
        }
    }
}