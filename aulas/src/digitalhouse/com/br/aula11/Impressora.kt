package digitalhouse.com.br.aula11

class Impressora() {
    val listaImprimivel = mutableListOf<Imprimivel>()
    fun novoItem(item: Imprimivel){
        listaImprimivel.add(item)
    }
    fun imprimirTodos(){
        for (item in listaImprimivel){
            item.imprimir()
        }
    }
}