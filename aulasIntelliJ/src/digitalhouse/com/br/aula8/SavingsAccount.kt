package digitalhouse.com.br.aula8

class SavingsAccount(private val interest: Double, balance: Double, client: Client) : Account(balance, client) {
    init {
        println("Conta Poupança. Taxa de juros mensal: ${interest * 100}%.")
    }
    override fun withdraw(amount: Double){
        if(amount<=balance){
            balance -= amount
            println("Cliente ${client.surname} sacou RS$$amount de sua conta. Saldo atual: RS$${balance}0.")
            return
        }
        println("Cliente ${client.surname} tentou sacar $amount. Saldo insuficiente.")
    }
    fun collectInterest(){
        balance *= 1+interest
        println("A conta Poupança de ${client.surname} teve juros de $interest% e o saldo atual é R$${balance}0.")
    }
}