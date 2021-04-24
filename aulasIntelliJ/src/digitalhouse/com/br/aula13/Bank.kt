package digitalhouse.com.br.aula13

class Bank : Printable {
    val accounts = arrayListOf<BankingAccount>()
    fun addAccount(account: BankingAccount){
        accounts.add(account)
    }fun removeAccount(account: BankingAccount){
        accounts.remove(account)
    }fun searchAccount(accountNumber: Int):BankingAccount?{
        for (account in accounts){
            if (account.accountNumber == accountNumber) return account
        }
        return null
    }
    override fun show() {
        for (account in accounts){
            account.show()
        }
    }
}