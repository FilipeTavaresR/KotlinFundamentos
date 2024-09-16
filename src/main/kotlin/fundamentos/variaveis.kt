package org.example.fundamentos

fun main() {
    var nome = "Filipe"
    val nomeVal = "Filipe"

    nome = "José"
    //nomeVal = "José"

    val idade = 34
    println(idade)
}

class variaveis{
    lateinit var teste: String

    fun iniciaVariaveis(){
        teste = "Teste"
    }
}