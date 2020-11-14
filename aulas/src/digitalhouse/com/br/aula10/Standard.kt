package digitalhouse.com.br.aula10

class Standard(valor: Double) : Ticket(valor) {
    override fun printCost() {
        println("Ingresso normal")
    }
}