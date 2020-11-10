package digitalhouse.com.br.aula8

class Account(var balance: Double,val client: Client) {
    fun deposit(amount: Double): Double{
        balance += amount
        return balance
    }
    fun withdraw(amount: Double): Double{
        if(balance<amount){
            println("Saldo insuficiente")
            return balance
        }
        balance -= amount
        return balance
    }

}