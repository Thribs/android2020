package digitalhouse.com.br.aula6

class Account(private val accNum: Int, var balance: Double, owner: Client) {
    init {
        println("Conta de número $accNum, pertencente a ${owner.name} ${owner.surname}.\nSaldo da conta: $balance")
    }
    fun deposit(amount: Double){
        balance += amount
        println("Realizada a operação de depósito.\nNovo saldo: R$$balance")
    }
    fun withdraw(amount: Double){
        var message="Saldo insuficiente"
        if(amount<=0){
            println("Operação inválida")
            return
        }
        if(amount<=balance){
            if(amount<=0){
                println("Operação inválida")
                return
            }
            balance -= amount
            message="Realizada a operação de saque.\nNovo saldo: R$$balance "
        }
        println(message)
    }
}