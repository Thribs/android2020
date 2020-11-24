package digitalhouse.com.br.aula13

class SavingsAccount(accountNumber: Int, balance: Double, val transactionFee: Double) : BankingAccount(accountNumber, balance) {
    override fun withdraw(amount: Double): Boolean {
        balance -= transactionFee
        super.withdraw(amount)
        return true
    }
    override fun show() {
        println("Conta: ${accountNumber}\nSaldo: R$${balance}0\nTaxa de operação: R$${transactionFee}0")
    }
}