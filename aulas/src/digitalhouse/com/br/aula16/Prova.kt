package digitalhouse.com.br.aula16

class Prova(){
    fun somaTotal(set: Set<Int>){
        var soma = 0
        for (num in set){
            soma += num
        }
        println(soma)
    }
}