package org.example.fundamentos

fun main() {

    var nome : String? = "Filipe"
    //nome = null

    println(nome?.length)

    val toShort : Short = nome!!.length.toShort()

    var nome2 : String? = "Filipe"

    var tamanho: Int = nome2?.length ?: 0

    println(tamanho)

    nome2 = null
    tamanho = nome2?.length ?: 0
    println(tamanho)

    var lista : List<Int?> = listOf(1,2, null, 4)
    var listaNullable: List<Int?>? = null
}