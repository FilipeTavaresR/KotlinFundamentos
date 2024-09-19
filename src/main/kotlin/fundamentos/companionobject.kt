package org.example.fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    companion object{
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Filipe","Rua Teste",30)
        }

        fun criarAPartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse{
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){

    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Filipe","Rua Teste",30)
    }
}

fun main() {

    var segundaClasse = SegundaClasse("nome","endereco",20).criarComValoresPadrao() //é necessário instanciar e depois utilizar os métodos

    var minhaClasse = MinhaClasse.criarComValoresPadrao() //é possível usar semelhante aos métodos estático

    var classe = MinhaClasse.criarAPartirDeSegundaClasse(segundaClasse)
}