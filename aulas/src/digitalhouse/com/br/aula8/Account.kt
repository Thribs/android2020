package digitalhouse.com.br.aula8

abstract class Account(protected var balance: Double,protected val client: Client){
    init {
        print("Cliente ${client.id} - ${client.surname}, portador do RG ${client.rg} e CPF ${client.cpf}.")
        println(" Saldo: RS$${checkBalance()}")
    }
    fun deposit(amount: Double){
        balance += amount
        println("Cliente ${client.surname} creditou RS$$amount em sua conta. Saldo atual: RS$${balance}0.")
    }
    abstract fun withdraw(amount: Double)

    private fun checkBalance(): Double{
        return balance
    }
}