package com.example.ejerciciostema4_pm_franciscorequenasanchez

class Mago:PNJ("Mago",150f,1600f,1) {

    fun subirlvl(){
        println("El mago ha subido de nivel:")
        lvl++
        println("El mago ha subido de nivel a $lvl")
        PM=PM+(PM*0.4f)
        println("Sus PM han subido a $PM")
        PV=PV+(PV*0.4f)
        println("Sus PV han subido a $PV")

    }
}