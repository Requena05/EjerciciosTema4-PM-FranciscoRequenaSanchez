package com.example.ejerciciostema4_pm_franciscorequenasanchez

class NotaAlarma(ident: Int, texto: String, var hora: Int, var minuto: Int) : Nota(ident, texto) {
    override fun toString(): String {
        return super.toString()
    }
    constructor( ident: Int, texto: String, hora: Int) : this(ident, texto, hora, 0)
  var hora_nota: Int = hora
      get()=field
      set(value){
          field=value
      }
   var minuto_nota: Int = minuto
      get()=field
      set(value) {
          field=value

      }



}