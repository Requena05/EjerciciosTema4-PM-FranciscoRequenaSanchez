package com.example.ejerciciostema4_pm_franciscorequenasanchez

import kotlin.math.E

fun main() {

    println("Ejercicio 1: Sistema solar")
    var sistema = Ejercicio1SistemaSolar()
    sistema.planetas.add(Ejercicio1Planeta("Sol", "Gaseoso", 123.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Venus", "Rocoso", 123.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Mercurio", "Rocoso", 77.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Marte", "Rocoso", 123.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Jupiter", "Gaseoso", 322.2131f))
    sistema.planetas.add(Ejercicio1Planeta("Tierra", "Rocoso", 123.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Saturno", "Gaseoso", 122.2131f))
    println("El planeta mas grande es: " + sistema.PlanetaMayor(sistema.planetas).nombre)
    println("El planeta mas pequeño es: " + sistema.PlanetaMenor(sistema.planetas).nombre)
    println("La masa media de los planetas es: " + sistema.MasaMedia(sistema.planetas))
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 2: Triangulo")
    var triangulo1 = Ejercicio2Triangulo(2f, 2f, 2f, 6f, "equilatero")
    println("El triangulo es rectangulo? " + triangulo1.isrectangulo())
    var triangulo2 = Ejercicio2Triangulo(2f, 3f, 4f, 9f, "escaleno")
    println("El triangulo es rectangulo? " + triangulo2.isrectangulo())
    var triangulo3 = Ejercicio2Triangulo(3f, 4f, 5f, 12f, "isoceles")
    println("El triangulo es rectangulo? " + triangulo3.isrectangulo())
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 3: Contacto")
    var contacto = Ejercicio3Contacto("Manu", "642957572", "FEWGWWGWEGW")
    var contacto2 = Ejercicio3Contacto("Juan", "642957572", "FEWGWWGWEGW")
    var contacto3 = Ejercicio3Contacto("Maria", "642957572", "FEWGWWGWEGW")
    var listacontactos = mutableListOf<Ejercicio3Contacto>()
    listacontactos.add(contacto)
    listacontactos.add(contacto2)
    listacontactos.add(contacto3)
    println("Lista de contactos: " + listacontactos)
    println("Maria se da de baja")
    listacontactos.remove(contacto3)
    println("Lista de contactos: " + listacontactos)
    println("-----------------------------------------------------------------------------------------------------------------")

    println("Ejercicio 4:  Registro de Estudiantes")
    var listaEstudiantes = mutableListOf<Ejercicio4Estudiantes>()
    listaEstudiantes.add(Ejercicio4Estudiantes("Manu", 23, 10f))
    listaEstudiantes.add(Ejercicio4Estudiantes("Juan", 23, 08f))
    listaEstudiantes.add(Ejercicio4Estudiantes("Maria", 23, 05f))
    listaEstudiantes.add(Ejercicio4Estudiantes("Jose", 23, 02f))
    listaEstudiantes.add(Ejercicio4Estudiantes("Pedro", 23, 01f))
    listaEstudiantes.add(Ejercicio4Estudiantes("Ana", 23, 06f))
    listaEstudiantes.add(Ejercicio4Estudiantes("Luis", 23, 03f))
    println("Lista de estudiantes: " + listaEstudiantes)
    println("Luis , Ana y Pedro se han dado de baja")
    listaEstudiantes.removeIf { it.nombre == "Luis" }
    listaEstudiantes.removeIf { it.nombre == "Ana" }
    listaEstudiantes.removeIf { it.nombre == "Pedro" }
    println("Lista de estudiantes: " + listaEstudiantes)
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 5:  Control de Inventario")
    var listaProductos = mutableListOf<Ejercicio5Controlinventario>()
    listaProductos.add(Ejercicio5Controlinventario("Manzanas", 1f, 20))
    listaProductos.add(Ejercicio5Controlinventario("Peras", 2f, 20))
    listaProductos.add(Ejercicio5Controlinventario("Naranjas", 3f, 20))
    listaProductos.add(Ejercicio5Controlinventario("Platanos", 4f, 20))
    listaProductos.add(Ejercicio5Controlinventario("Fresas", 5f, 20))
    listaProductos.add(Ejercicio5Controlinventario("Cerezas", 6f, 20))
    listaProductos.add(Ejercicio5Controlinventario("Melocotones", 7f, 20))

    println("Lista de productos: " + listaProductos)
    println("Se han comprado 10kg platanos, 5kg naranjas y 20kg cerezas")

        listaProductos.forEach {if (it.nombre_producto=="Platanos")it.Cantidad-=5}
        listaProductos.forEach{if(it.nombre_producto=="Naranjas")it.Cantidad-=10}
        listaProductos.forEach{if(it.nombre_producto=="Cerezas")it.Cantidad-=20}

    println("Lista de productos: " + listaProductos)
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 6 Añadir planetas al sistema solar")
    sistema.planetas.add(Ejercicio1Planeta("Sol", "Gaseoso", 123.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Venus", "Rocoso", 123.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Mercurio", "Rocoso", 77.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Marte", "Rocoso", 123.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Jupiter", "Gaseoso", 322.2131f))
    sistema.planetas.add(Ejercicio1Planeta("Tierra", "Rocoso", 1.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Saturno", "Gaseoso", 122.2131f))
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 7. Muestra por pantalla toda la información de todos los planetas")
    sistema.planetas.forEach { println(it.nombre+" "+it.masa+" "+it.tipo) }
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 8. Muestra por pantalla todos los planetas que empiecen por la letra ‘M’")
    println("Planetas que empiezan por M: ")
    sistema.planetas.forEach { if (it.nombre.startsWith("M")) println(it.nombre+" "+it.masa+" "+it.tipo) }
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 9. Muestra por pantalla todos los planetas gaseosos cuya masa sea\n"
            +"superior a 20 veces la de la tierra")
    println("Planetas gaseosos con masa superior a 20 veces la de la tierra: ")
    println("La masa de la tierra "+sistema.PlanetaMenor(sistema.planetas).masa)
    sistema.planetas.forEach{ if (it.masa>20*sistema.PlanetaMenor(sistema.planetas).masa) println(it.nombre+" "+it.masa+" "+it.tipo) }
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 10. Muestra por pantalla la masa media de los planetas del sistema solar")
    println("La masa media de los planetas del sistema solar es: "+sistema.MasaMedia(sistema.planetas))
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 11. Crea la clase equipo de fútbol que contenga el nombre y país\n" +
            "del equipo")
    println("Ya esta creada la clase")
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 12. Crea una lista con 16 equipos de fútbol de países distintos (no\n" +
            "puede haber más de cuatro equipos por país)\n")
    var listaequipos = mutableListOf<Ejercicio11equipo>()
    listaequipos.add(0,Ejercicio11equipo("Real Madrid", "España"))
    listaequipos.add(1,Ejercicio11equipo("Barcelona", "España"))
    listaequipos.add(2,Ejercicio11equipo("Sevilla", "España"))
    listaequipos.add(3,Ejercicio11equipo("Atlético de Madrid", "España"))
    listaequipos.add(4,Ejercicio11equipo("Manchester United", "Inglaterra"))
    listaequipos.add(5,Ejercicio11equipo("Manchester City", "Inglaterra"))
    listaequipos.add(6,Ejercicio11equipo("Liverpool", "Inglaterra"))
    listaequipos.add(7,Ejercicio11equipo("Chelsea", "Inglaterra"))
    listaequipos.add(8,Ejercicio11equipo("PSG", "Francia"))
    listaequipos.add(9,Ejercicio11equipo("Marseille", "Francia"))
    listaequipos.add(10,Ejercicio11equipo("Juventus", "Italia"))
    listaequipos.add(11,Ejercicio11equipo("Milan", "Italia"))
    listaequipos.add(12,Ejercicio11equipo("Inter de Milan", "Italia"))
    listaequipos.add(13,Ejercicio11equipo("Atalanta", "Italia"))
    listaequipos.add(14,Ejercicio11equipo("Bayern de Múnich", "Alemania"))
    listaequipos.add(15,Ejercicio11equipo("Borussia Dortmund", "Alemania"))
    listaequipos.forEach{ println(it.nombre+","+it.pais) }
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 13. Crea la función championsLeague() que recibe como entrada la\n" +
            "lista con los 16 equipos y muestra por pantalla un sorteo de octavos* de final\n" +
            "de la Champions. *(no tengas en cuenta que equipos de un mismo país no\n" +
            "pueden enfrentarse)")

    var champions = Champions(listaequipos)
    champions.sorteo()
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 14: Crea la clase circunferencia. El constructor primario recibirá el\n" +
            "radio de la circunferencia y el secundario r ecibirá la posición del centro de la\n" +
            "circunferencia y un punto cualquiera de la misma. Crear el método longitud()\n" +
            "y sobrecargar el método toString() de forma que muestre toda la info de la\n" +
            "circunferencia\n")


}