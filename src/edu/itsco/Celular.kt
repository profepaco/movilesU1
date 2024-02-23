package edu.itsco

class Celular(marca: String,
    modelo: String,
    precio: Double): Telefono(
    marca,modelo,precio)  {
    fun enviarMensaje(msg: String){
        println("Enviando: $msg")
    }

    override fun recibirLlamada(
        numero: String) {
        super.recibirLlamada(numero)
        println("Del número: $numero")
    }
}