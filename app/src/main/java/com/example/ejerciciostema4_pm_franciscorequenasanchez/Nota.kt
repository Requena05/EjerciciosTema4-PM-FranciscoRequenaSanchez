package com.example.ejerciciostema4_pm_franciscorequenasanchez
//clase Nota. Una nota contiene un identificador numérico y una línea de texto. Define\n" +
//            "constructor, accedentes y toString.

open class Nota(var ident: Int, var texto: String) {

    constructor(ident: Int) : this(ident, "")
    var id: Int = ident
        get()=field
        set(value){
            field=value

        }
    var texto_nota: String = texto
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Nota(id=$id, texto='$texto_nota')"
    }



}