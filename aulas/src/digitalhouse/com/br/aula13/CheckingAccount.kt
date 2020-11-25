package digitalhouse.com.br.aula13

class CheckingAccount(accountNumber: Int, balance: Double = 0.0, private val overdraft: Double = 0.0) : BankingAccount(accountNumber, balance) {
    override fun withdraw(amount: Double): Boolean {
        if(amount<=balance+overdraft){
            balance -= amount
            return true
        }
        super.withdraw(amount)
        return false
    }
    override fun show() {
        println("Conta: ${accountNumber}\nSaldo: R$${balance}0\nLimite do cheque especial: R$${overdraft}")
    }
}