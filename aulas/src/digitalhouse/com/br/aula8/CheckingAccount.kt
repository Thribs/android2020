package digitalhouse.com.br.aula8

class CheckingAccount(private val checkLimit: Double, balance: Double, client: Client) : Account(balance, client) {
    init {
        println("Conta Corrente. Limite de cheque especial: RS$$checkLimit")
    }
    fun depositCash(amount: Double){
        deposit(amount)
    }
    fun depositCheck(check: Check){
        deposit(check.amount)
        return
    }
    override fun withdraw(amount: Double){
        if (amount<=balance+checkLimit){
            balance -= amount
            println("Cliente ${client.surname} sacou RS$$amount de sua conta. Saldo atual: RS$$balance")
            return
        }
        println("Cliente ${client.surname} tentou sacar RS$$amount. Saldo insuficiente")
    }
}