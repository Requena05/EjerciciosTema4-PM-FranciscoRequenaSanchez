package com.example.ejerciciostema4_pm_franciscorequenasanchez

open class PNJ(var nombre_personaje:String,var PM:Float,var PV:Float,var lvl:Int) {


    override fun toString(): String {
        return "Nombre: $nombre_personaje, PM: $PM, PV: $PV, lvl: $lvl"
    }

}