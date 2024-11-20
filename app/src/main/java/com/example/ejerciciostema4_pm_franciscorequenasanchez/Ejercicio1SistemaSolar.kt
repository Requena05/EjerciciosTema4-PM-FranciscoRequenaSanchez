package com.example.ejerciciostema4_pm_franciscorequenasanchez

class Ejercicio1SistemaSolar {
    var planetas = mutableListOf<Ejercicio1Planeta>()
    fun PlanetaMayor(ejercicio1Planetas: MutableList<Ejercicio1Planeta>): Ejercicio1Planeta {
        var mayor = ejercicio1Planetas[0]
        for (i in 1 ..  ejercicio1Planetas.size-1) {
            if (ejercicio1Planetas[i].masa > mayor.masa) {
                mayor = ejercicio1Planetas[i]
            }
        }
        return mayor
    }
    fun PlanetaMenor(ejercicio1Planetas: MutableList<Ejercicio1Planeta>): Ejercicio1Planeta {
        var menor = ejercicio1Planetas[0]
        for (i in 1..ejercicio1Planetas.size - 1) {
            if (ejercicio1Planetas[i].masa < menor.masa) {
                menor = ejercicio1Planetas[i]
            }

        }
        return menor
    }
    fun MasaMedia(ejercicio1Planetas: MutableList<Ejercicio1Planeta>): Float {
        var suma = 0f
        for (i in 0..ejercicio1Planetas.size - 1) {
            suma += ejercicio1Planetas[i].masa
        }
        return suma / ejercicio1Planetas.size
    }
}