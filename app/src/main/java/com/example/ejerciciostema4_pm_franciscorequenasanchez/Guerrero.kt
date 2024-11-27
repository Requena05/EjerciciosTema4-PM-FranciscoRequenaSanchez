package com.example.ejerciciostema4_pm_franciscorequenasanchez

class Guerrero: PNJ(nombre_personaje ="Guerrero", PM = 50f, PV = 400f, lvl = 1){

   fun subirlvl(){
       println("El guerrero ha subido de nivel:")
       lvl++
       println("El guerrero ha subido de nivel a $lvl")
       PM=PM+(PM*0.1f)
       println("Sus PM han subido a $PM")
       PV=PV+(PV*0.8f)
       println("Sus PV han subido a $PV")

   }
}