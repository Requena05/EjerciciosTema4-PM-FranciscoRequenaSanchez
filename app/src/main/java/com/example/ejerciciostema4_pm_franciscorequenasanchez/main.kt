package com.example.ejerciciostema4_pm_franciscorequenasanchez

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
    sistema.planetas.add(Ejercicio1Planeta("Tierra", "Rocoso", 123.2313f))
    sistema.planetas.add(Ejercicio1Planeta("Saturno", "Gaseoso", 122.2131f))
    println("-----------------------------------------------------------------------------------------------------------------")


}