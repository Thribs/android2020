package digitalhouse.com.br.aula8

open class Account(protected var balance: Double,protected val client: Client){
    init {
        print("Cliente ${client.id} - ${client.surname}, portador do RG ${client.rg} e CPF ${client.cpf}.")
        println(" Saldo: RS$${checkBalance()}")
    }
    fun deposit(amount: Double){
        balance += amount
        println("Cliente ${client.surname} creditou RS$$amount em sua conta. Saldo atual: RS$$balance")
    }
    open fun withdraw(amount: Double){
        if(amount<=balance){
            balance -= amount
            println("Cliente ${client.surname} sacou RS$$amount de sua conta. Saldo atual: RS$$balance")
            return
        }
        println("Cliente ${client.surname} tentou sacar $amount. Saldo insuficiente")
    }
    fun checkBalance(): Double{
        return balance
    }
}