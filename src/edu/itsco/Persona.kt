package edu.itsco

class Persona constructor(
    nombre: String,
    apellidos: String
) {
    val _nombre = nombre
    val _appellidos = apellidos

    init{
        println("Nombre: $_nombre")
        println("Apellido: $_appellidos")
    }


}