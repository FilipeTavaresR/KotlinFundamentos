package org.example.fundamentos

fun main() {

    var lista = listOf(1,2,3,4,6)
    val pares = lista.filter { it % 2 == 0 }.first()
    var listaMutavel = mutableListOf(1,2,3,4,6)

    println(pares)

    lista.forEach{
        println(it)
    }

    for (numero in lista){
        println(numero)
    }

    println(lista[0])
    println(lista.get(0))
    println(lista.size)
    println(lista.indexOf(6))

    println(listaMutavel)
    listaMutavel.add(8)
    listaMutavel.removeAt(0)
    listaMutavel.remove(3)
    println(listaMutavel)
    listaMutavel[0] = 20
    println(listaMutavel)
    listaMutavel.add(21)
    listaMutavel.add(15)
    println(listaMutavel)
    listaMutavel.sort()
    println(listaMutavel)
    listaMutavel.shuffle()
    println(listaMutavel)

    var listaNomes = mutableListOf("Filipe","Adriano")
    println(listaNomes)
    listaNomes.sort()
    println(listaNomes)


    //set não aceita valores duplicados, existem mutableSetOf, se comporta igual a lista
    var setNumeros = setOf(1,2,3,2)
    println(setNumeros)
    println(setNumeros.contains(2))



    var mapNomeIdade = mapOf("Filipe" to 34, "Adriano" to 20)
    println(mapNomeIdade)

    var mutableMapNomeIdade = mutableMapOf("Filipe" to 34, "Adriano" to 20)
    println(mutableMapNomeIdade)
    mutableMapNomeIdade["Bruno"] = 30 // = mutableMapNomeIdade.put("Bruno",30)
    println(mutableMapNomeIdade)

    mutableMapNomeIdade.remove("Filipe")
    println(mutableMapNomeIdade)

    mutableMapNomeIdade["Adriano"] = 25 //sobrescreve a chave da lista com novo valor
    println(mutableMapNomeIdade)

    mutableMapNomeIdade.putIfAbsent("Bruno", 70) //adiciona no map caso a chave ainda não exista
    println(mutableMapNomeIdade)



}