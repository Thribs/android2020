package digitalhouse.com.br.aula10

class Standard(cost: Double) : Ticket(cost) {
    override fun printCost() {
        println("O ingresso normal custa R$${cost}0.")
    }
}