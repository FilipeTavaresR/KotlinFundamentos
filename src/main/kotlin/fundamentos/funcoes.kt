package org.example.fundamentos

fun main() {
    println("Hello World")
    println(retornaNome())
    var nome = retornaNome()
    println(nome)
    dizOi("Filipe",34)
    dizOi(retornaNome(),34)
    dizOi(idade = 34, nome = retornaNome())
    dizOla("Filipe")
}

fun retornaNome(): String{
    return "Filipe"
}

fun dizOi(nome: String, idade: Int){
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")
}

fun dizOla(nome: String, idade: Int = 34){
    println("Ola ${nome}, parabéns pelos seus ${idade} anos")
}