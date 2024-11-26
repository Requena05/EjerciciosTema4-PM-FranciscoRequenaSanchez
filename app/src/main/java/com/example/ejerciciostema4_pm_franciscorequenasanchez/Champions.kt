package com.example.ejerciciostema4_pm_franciscorequenasanchez

class Champions(var equipos: MutableList<Ejercicio11equipo>) {
    fun sorteo() {
        //Ejercicio 13. Crea la función championsLeague() que recibe como entrada la
        //lista con los 16 equipos y muestra por pantalla un sorteo de octavos* de final
        //de la Champions. *(no tengas en cuenta que equipos de un mismo país no
        //pueden enfrentarse)
        println("Sorteo de octavos de final de la Champions League")

        var indexRandom = (0 until equipos.size).random()
        var equipo1 = equipos[indexRandom]
        equipos.removeAt(indexRandom)

        var random2 = (0 until equipos.size).random()
        var equipo2 = equipos[random2]
        equipos.removeAt(random2)

        println(equipo1.nombre + " vs " + equipo2.nombre)

        while (equipos.size > 0) {
            indexRandom = (0 until equipos.size).random()
            equipo1 = equipos[indexRandom]
            equipos.removeAt(indexRandom)
            random2 = (0 until equipos.size).random()
            equipo2 = equipos[random2]
            equipos.removeAt(random2)
            println(equipo1.nombre + " vs " + equipo2.nombre)

        }
    }
}