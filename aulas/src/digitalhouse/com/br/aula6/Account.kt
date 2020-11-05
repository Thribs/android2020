package digitalhouse.com.br.aula6

class Account(val accNum: Int, var balance: Double, owner: Client) {
    init {
        println("Conta de número $accNum, pertencente a ${owner.name} ${owner.surname}.\nSaldo da conta: $balance")
    }
    fun deposit(amount: Double) : String{
        balance += amount
        return "Realizada a operação de depósito.\nNovo saldo: $balance"
    }
    fun withdraw(amount: Double) : String{
        var message="Saldo insuficiente"
        if(amount<=balance){
            balance -= amount
            message="Realizada a operação de saque.\nNovo saldo: $balance "
        }
        return message

    }
}