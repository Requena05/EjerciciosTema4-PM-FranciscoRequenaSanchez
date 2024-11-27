package com.example.ejerciciostema4_pm_franciscorequenasanchez
//clase BlocNotas que modela un bloc de notas en el que se pueden introducir notas, listar
//todas las notas, eliminar una nota mediante su posición en el bloc de notas o saber cuantas
//notas contiene el bloc de notas. Debes utilizar una colección
class BlocDeNotas(var notas: MutableList<Nota>) {
    fun addNota(id: Int, texto: String) {
        notas.add(Nota(id,texto))
    }
    fun listarNotas() {
        for (i in 0 until notas.size) {
            println("Nota $i: ${notas[i]}")
        }
        }
    fun eliminarNota(posicion: Int) {
        notas.removeAt(posicion)
    }
    fun numeroNotas(): Int {
        return notas.size
    }

    override fun toString(): String {
        return listarNotas().toString()
    }
}