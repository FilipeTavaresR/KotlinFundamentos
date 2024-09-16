package org.example.fundamentos

fun main() {
    parOuImpar(2)
    parOuImpar(3)
    resultadoDaNota(1)
    resultadoDaNota(5)
    resultadoDaNota(6)
    println(parOuImpar2(2))
    println(parOuImpar2(9))
}

fun parOuImpar(numero: Int)  {
    if(numero % 2 == 0) {
        println("Par")
    }else {
        println("Impar")
    }
}

fun parOuImpar2(numero: Int): String {
    return if(numero % 2 == 0)
        "Par"
    else
        "Impar"
}

//se a nota for > 6 -> passou
//se a nota for > 4 -> recuperação
//se a nota for < 4 -> reprovou
fun resultadoDaNota(nota: Int){
    if(nota >= 6){
        println("Passou")
    } else if (nota >= 4) {
        println("Recuperação")
    }else {
        println("Reprovou")
    }
}