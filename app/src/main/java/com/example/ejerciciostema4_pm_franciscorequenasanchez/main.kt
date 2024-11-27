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
    var circulo = Circunferencia(2.89f)
    println(circulo.toString())
    println("La longitud del circulo es: "+circulo.longitud())

    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 15: Crea la clase Círculo que hereda de circunferencia. Tendrá dos\n" +
            "constructores, el primero recibirá el radio y el color del círculo y el segundo\n" +
            "su centro, un punto cualquiera y su color. Crear el método área() y\n" +
            "sobrecargar el método toString() de forma que muestre toda la info de la\n" +
            "circunferencia")
    var circulo2 = Circulo(3.14f,"Rojo")
    println(circulo2.area())
    println(circulo2.toString())
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 16: Clase de matemáticas. Crea una clase Matemáticas con métodos para realizar\n" +
            "operaciones matemáticas como sumar, restar, multiplicar y dividir. Luego, utiliza esta clase en tu\n" +
            "programa principal.")
        println("Bienvenido a la calcular")
        println("Eliga su funcion:")
        println("1. Suma")
    println("2. Resta")
    println("3. Multiplicacion")
    println("4. Division")
    var funcion = readln().toInt()
    println("Numero1:")
    var num1 = readln().toFloat()
    println("Numero2:")
    var num2 = readln().toFloat()
    var matematica = Matematicas(num1, num2)
    if(funcion==1){
        println("Resultado: "+matematica.sumar())
    }
    if(funcion==2){
        println("Resultado: "+matematica.restar())
    }
    if(funcion==3){
        println("Resultado: "+matematica.multiplicar())
    }
    if(funcion==4){
        println("Resultado: "+matematica.dividir())
    }
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 17: Implementa las siguientes clases:\n" +
            "clase Nota. Una nota contiene un identificador numérico y una línea de texto. Define\n" +
            "constructor, accedentes y toString.\n" +

            "clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma. Define\n" +
            "constructor, accedentes y toString.\n" +

            "clase BlocNotas que modela un bloc de notas en el que se pueden introducir notas, listar\n" +
            "todas las notas, eliminar una nota mediante su posición en el bloc de notas o saber cuantas\n" +
            "notas contiene el bloc de notas. Debes utilizar una colección.\n" +

            "clase Prueba que cree un bloc de Notas de ejemplo y pruebe las operaciones que soporta. . ")

    var notas = Nota(1,"Viva el vino")
        notas.id
        notas.texto_nota
    var notaalarma=NotaAlarma(1,"vvvv",12,24)

        println( notaalarma.hora_nota)
        println( notaalarma.minuto_nota)
    var blocdenotas: BlocDeNotas
    blocdenotas = BlocDeNotas(mutableListOf<Nota>())
    blocdenotas.addNota(1,"Viva el vino")
    blocdenotas.addNota(2,"Viva la vida")
    blocdenotas.addNota(3,"Viva la vida")
    blocdenotas.addNota(4,"Viva la vida")
    blocdenotas.addNota(5,"Viva la vida")
    blocdenotas.listarNotas()

    println("Numero de notas: "+blocdenotas.numeroNotas())

    blocdenotas.eliminarNota(2)
    blocdenotas.listarNotas()
    println("Numero de notas: "+blocdenotas.numeroNotas())
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 18\n" +
            "Define una jerarquía de clases que permita almacenar datos sobre los\n" +
            "planetas y satélites que forman parte del sistema solar (junto con el sol).\n" +
            "Algunos atributos que puede ser interesante recoger son: la masa del\n" +
            "cuerpo, su diámetro medio, el período de rotación sobre el propio eje,\n" +
            "período de traslación alrededor del cuerpo que orbitan, distancia media a\n" +
            "ese cuerpo, excentricidad de la órbita, etc.\n" +
            "Define un método que, dado un objeto del sistema solar (planeta o satélite),\n" +
            "imprima toda la información de que se dispone sobre el mismo. ")

    //Crea un planeta con los datos de la clase Planeta
    var planeta1=Planeta("Saturno","Gaseoso",123.2313f,123.2313f,123.2313f,123.2313f,123.2313f,123.231f)
    var satelite1=Satelite("Macaco","Rocoso",123.2313f,123.2313f,123.2313f,123.2313f,123.2313f,123.231f)
    var sistemaSolar=SistemaSolar(mutableListOf<Any>(planeta1,satelite1))

    sistemaSolar.mostrarPlanetas()
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 19\n" +
            "Crea la clase PNJ que representa un personaje en un juego de rol.\n" +
            "La clase tendrá los atributos, nombre, PV –Puntos de Vida-, PM\n" +
            "–Puntos mágicos- y LVL. Crea las clases hijas de PNJ Guerrero y\n" +
            "Mago. Dichas clases implementarán el método levelUp() que\n" +
            "incrementa el atributo LVL del personaje y sus atributos PV y MP.\n" +
            "Los guerreros por cada nuevo nivel tendrán un 8% más de PV y un\n" +
            "1% más de PM mientras que los magos tendrán un 4% más de PV y\n" +
            "un 3% más de PM. Crear un guerrero de nivel 1 con 400PV y 50PM y\n" +
            "un mago de nivel 1 con 1600PV y 150PM. Partiendo del hecho de\n" +
            "que ambos personajes subirán de nivel siempre a la vez ¿en qué\n" +
            "nivel el guerrero tendrá más PV que el mago? ")
    var mago=Mago()
    var guerrero=Guerrero()
    for (i in 1..10){
        mago.subirlvl()
        guerrero.subirlvl()

    }
    println("El guerrero supera al mago en el nivel 7 y tiene mas PV")
    println("-----------------------------------------------------------------------------------------------------------------")
    println("Ejercicio 20. Crea la clase de datos Videojuego, que tendrá nombre, año y plataforma del\n" +
            "juego. Crea una lista con 8 videojuegos de tres plataformas distintas. Crea una función\n" +
            "que dada una lista de juegos, una año y una plataforma devuelve los juegos de la lista de\n" +
            "dicho año y plataforma. La función también debe poder usarse especificando solo el año\n" +
            "o solo la plataforma. ")
    var lista = mutableListOf<Videojuego>()
    lista.add(Videojuego("GTA",2020,"PC"))
    lista.add(Videojuego("Fortnite",2017,"PC"))
    lista.add(Videojuego("Crash Bandicoot",2002,"PC"))
    lista.add(Videojuego("GTA",2020,"PS4"))
    lista.add(Videojuego("Fortnite",2017,"PS4"))
    lista.add(Videojuego("Crash Bandicoot",2002,"PS4"))
    lista.add(Videojuego("GTA",2020,"Xbox"))
    lista.add(Videojuego("Fortnite",2017,"Xbox"))
    var nombre = Videojuego(" ",2020,"PC")
    nombre.buscar(lista,nombre=null,año=2017, plataforma = null)
    println("-----------------------------------------------------------------------------------------------------------------")








}