package edu.itsco

fun main(){
    /*println("Hola mundo en Kotlin")*/
    /*
    val pi = 3.1416 //constantes
    val otra: Int
    otra = 12
    //no se puede modificar por que
    // es contante
    //otra = 15
    var nombre = "Kevin"
    println("Hola $nombre")

    nombre = "Jonathan"
    println("Hola que tal $nombre")
    val multilinea = """Hola yo soy
        |un string multilinea
        |y puedo ocupar muchas líneas
        |así como un Lorem Impsum
    """.trimMargin()
    println(multilinea)

    val arreglo: Array<Int>
    arreglo = arrayOf(0,1,2,3,4,5)
    println(arreglo)

    val arreglo2 = intArrayOf(1,2,3,4,5)
    */
/*
    val a = 10
    val b = 8
    if(a>b){
        println("A es mayor")
    }else{
        println("B es mayor")
    }
    val mayor = if(a>b) a else b
    println("Mayor: $mayor")

    val menor = if(a<b) {
            println("A es menor")
            a
        }else {
            println("B es menor")
            b
        }
    println("Menor: $menor")

    val n = 1
    when(n){
        1 ->{
            println("Es uno")
            println("Y tiene mas lineas")
        }
        2 -> println("Es dos")
        else -> println("ni uno ni dos")
    }

    for (i in 1..3){
        println("Vuelta $i")
    }

    val vocales = "aeiou"
    for (letra in vocales){
        println(letra)
    }


 */
    /*
    greeting()
    val result = add(5,2)
    println("La suma es: $result")

    val cuadrado = pow(3)
    val cubo = pow(3,3)
    println("Cuadrado de 3 = $cuadrado")
    println("Cubo de 3 = $cubo")

    val cuarta = pow(pow=4, num=3)
    println("4ta potencia 3 = $cuarta")



    val elBenja = Persona(
        "Benjamin",
        "Santos"
    )

    val pixel = Telefono(
        marca = "Google",
        modelo = "Pixel 6",
        precio = 6500.00
    )

    println("Modelo: ${pixel.modelo}")
    pixel.precio = 5700.00
    */
    /*val rect: Rectangulo = Rectangulo(
        4.0,3.0)
    println("Área: ${rect.Area}")
    rect.soyUnMetodo()*/
    val telefono = Telefono(
        "Motorola",
        "SGH-123",
        399.00)
    val celular = Celular(
        "Nokia",
        "3310",
        899.00
    )
    telefono.recibirLlamada("28899999")
    celular.recibirLlamada("2881179099")
}

fun greeting(){
    println("Hola que tal")
}

fun add(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun pow(num: Int, pow:Int = 2):Int{
    var result:Int = 1
    for(i in 1..pow){
        //result = result*num
        result *= num
    }
    return result
}
