package digitalhouse.com.br.aula13
abstract class BankingAccount(val accountNumber: Int, var balance: Double) : Printable {
    init {
        println("Conta $accountNumber criada com saldo de R$${balance}0")
    }
    open fun withdraw(amount: Double): Boolean{
        if(amount <= balance) {
            balance -= amount
            return true
        }
        else println("Erro: Saldo insuficiente.")
        return false
    }
    open fun deposit(amount: Double): Boolean{
        balance += amount
        return true
    }
    fun wire(amount: Double, account: BankingAccount): Boolean{
        if(accountNumber != account.accountNumber) {
            if(withdraw(amount)) {
                account.deposit(amount)
                println("\nTransferido R$${amount}0 para a conta ${account.accountNumber}")
                return true
            }
            println("Erro: Saldo insuficiente.")
        }
        else println("Erro: A conta de origem e destino são a mesma.")
        return false
    }
}