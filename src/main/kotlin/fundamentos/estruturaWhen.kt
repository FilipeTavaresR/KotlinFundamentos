package org.example.fundamentos

fun main() {
    var x = -5

    when(x) {
        5, -5 -> println("x == 5")
        8 -> println("x == 8")
        9 -> println("x == 9")
        10 -> {
            println("x == 10")
            println("x é uma dezena")
        }
        in 11..15 -> println("x está entre 11 e 15")
        !in 16..20 -> println("número não está no range de 16 a 20")
        else -> println("Número não encontrado")
    }

    println(comecaComOi("tudo bem?"))
    println(comecaComOi(5))
    println(comecaComOi("oi"))

    when {
        comecaComOi(5) -> println("5")
        //comecaComOi("oi, tudo bem?") -> println("oi, tudo bem?")
        comecaComOi("oi, estou bem!") -> println("oi, estou bem!")
    }

}

fun comecaComOi(texto: Any): Boolean{
    return when(texto) {
        is String -> texto.startsWith("oi")
        else -> false
    }
}