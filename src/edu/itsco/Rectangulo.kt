package edu.itsco

class Rectangulo(_base: Double,
    _altura: Double) {
    var Base: Double = 0.0
        get() = field
        set(value){
            field = value
        }
    var Altura: Double = 0.0
        get() = field
        set(value){
            field = value
        }

    val Area: Double
        get() = this.Base * this.Altura
    init{
        this.Base = _base
        this.Altura = _altura
    }

    fun soyUnMetodo(){
        println("ESte es un método")
    }
}