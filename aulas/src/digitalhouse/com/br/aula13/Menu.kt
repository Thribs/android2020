package digitalhouse.com.br.aula13

fun main() {
    val nubank = Bank()
    var accountType: Int
    var accountNumber: Int
    var deposit = 0.0
    var overdraft: Double
    var transactionFee: Double
    val contaCorrente: CheckingAccount
    val contaPoupanca: SavingsAccount

    println("Pressione a opção desejada:\n" +
            "1. Criar conta\n" +
            "2. Selecionar conta\n" +
            "3. Remover conta\n" +
            "4. Gerar relatório\n" +
            "5. Finalizar")
    //Substituindo leitura por entrada direta, por motivo de didática
    //Opção 1:
    println("1. Conta corrente\n" +
            "2. Conta poupança")
    println("Digite o depósito inicial")
    accountType = 1
    accountNumber = 1002
    overdraft = 100.0
    if (accountType == 1) {
        contaCorrente = CheckingAccount(accountNumber, deposit,overdraft)
        nubank.addAccount(contaCorrente)
    }
    accountType = 2
    accountNumber = 2002
    deposit = 200.0
    transactionFee = 2.0
    if (accountType == 2) {
        contaPoupanca = SavingsAccount(accountNumber, deposit,transactionFee)
        nubank.addAccount(contaPoupanca)
    }
    //Opção 2:
    println("a. Depósito\n" +
            "b. Saque\n" +
            "c. Transferência\n" +
            "d. Relatório\n" +
            "e. Retorna ao menu anterior")
    // Opção 3
    accountNumber = 1002
    var account = nubank.searchAccount(1002)
    nubank.removeAccount(account)

}
