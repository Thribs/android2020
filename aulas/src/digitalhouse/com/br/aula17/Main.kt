package digitalhouse.com.br.aula17

import java.lang.IndexOutOfBoundsException

fun main() {
    val listaStrings = mutableListOf<String>()
    listaStrings.addAll(listOf("Pato","Cachorro","Gato"))
    try{
        println(listaStrings[3])
    }catch (ex: IndexOutOfBoundsException){
        println("Índice não encontrado na lista")
    }catch (ex: Exception){
        ex.message
    }
    val listaString2: MutableList<String>? = null
    listaString2?.add("Pato")
    listaString2?.add("Cachorro")
    listaString2?.add("Gato")
    println(listaString2!!.get(2))
}