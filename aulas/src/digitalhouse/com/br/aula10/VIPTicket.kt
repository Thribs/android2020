package digitalhouse.com.br.aula10

abstract class VIPTicket(cost: Double,additionalCost: Double, val location: String) : Ticket(cost + additionalCost){
    override fun printCost() {
        println("O ingresso normal para o camarote $location custa R$${cost}0.")
    }
    fun printLocation(){
        println(location)
    }
}