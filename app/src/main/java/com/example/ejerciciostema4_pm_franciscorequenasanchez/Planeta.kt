package com.example.ejerciciostema4_pm_franciscorequenasanchez
//Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites
//que forman parte del sistema solar (junto con el sol).
//Algunos atributos que puede ser interesante recoger son: la masa del cuerpo, su diámetro
//medio, el período de rotación sobre el propio eje, período de traslación alrededor del
//cuerpo que orbitan, distancia media a ese cuerpo, excentricidad de la órbita, etc.
//Define un método que, dado un objeto del sistema solar (planeta o satélite), imprima toda
//la información de que se dispone sobre el mismo.
class Planeta(var nombre:String,var tipo:String, var masa:Float, var diametro:Float, var rotacion:Float, var traslacion:Float, var distancia:Float, var excentricidad:Float ) {

    override fun toString(): String {
        return "$nombre $tipo $masa $diametro $rotacion $traslacion $distancia $excentricidad"
    }
}