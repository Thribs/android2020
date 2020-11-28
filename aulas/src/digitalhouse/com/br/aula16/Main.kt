package digitalhouse.com.br.aula16

fun main(){
    val loteriaDosSonhos = mapOf(0 to "Ovos",1 to "Água",2 to "Escopeta", 3 to "Cavalo",4 to "Dentista",5 to "Fogo")
    val apelidos = mapOf<String, List<String>>(
            "João" to listOf<String>("Juan","Fissura","Maromba"),
            "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf("Wonder Woman","Mary","Marllene"),
            "Lucas" to listOf("Lukinha","Jorge","George")
    )
    val emptyList = mutableListOf<Int>()
    val lista = listOf(1,5,5,6,7,8,8,8)
    emptyList.addAll(lista)

    val emptySet = mutableSetOf<Int>()
    emptySet.addAll(lista)

    println(loteriaDosSonhos)
    println(apelidos)
    println(emptyList)
    println(emptySet)

    apelidos.forEach {
        println("Meu(inha) amigo(a) ${it.key} tem os apelidos: ${it.value}")
    }





}