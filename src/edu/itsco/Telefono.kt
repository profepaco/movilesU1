package edu.itsco

open class Telefono(
    val marca: String,
    val modelo: String,
    var precio: Double
){
    fun llamar(numero: String){
        println("Llamando al $numero")
    }

    open fun recibirLlamada(numero: String){
       println("Recibiendo llamada")
    }
}

