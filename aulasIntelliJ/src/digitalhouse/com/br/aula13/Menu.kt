package digitalhouse.com.br.aula13

fun main() {
    val bank = Bank()

    while (true) {
        println("Pressione a opção desejada:\n" +
                "1. Criar conta\n" +
                "2. Selecionar conta\n" +
                "3. Remover conta\n" +
                "4. Gerar relatório\n" +
                "5. Finalizar")
        when (readLine()?: "") {
            "1" -> newAccount(bank)
            "2" -> operateAccount(bank)
            "3" -> deleteAccount(bank)
            "4" -> report(bank)
            "5" -> {
                println("Encerrando aplicação. Tenha um bom dia")
                break
            }
            else -> {
                println("Opção inválida")
            }
        }
    }
}

fun newAccount(bank: Bank): Boolean{
    println("1. Conta corrente\n" +
            "2. Conta poupança")
    val accountType = readInt()
    when (accountType) {
        1 -> 2+2
        2 -> 4-1
        else -> {
            println("Seleção inválida")
            return false
        }
    }
    // TODO: Automate assignment of accountNumber
    println("Digite o número da conta")
    val accountNumber = readInt()
    if (accountNumber == 0) {
        println("Número inválido")
        return false
    }
    if (bank.searchAccount(accountNumber) != null) {
        println("Já existe uma conta com este número")
        return false
    }
    println("Valor do primeiro depósito:")
    val deposit = readDouble()
    return when (accountType) {
        1 -> {
            println("Limite do cheque especial:")
            val overdraft = readDouble()
            val account = CheckingAccount(accountNumber, deposit, overdraft)
            bank.addAccount(account)
            true
        }
        2 -> {
            println("Taxa de transferência:")
            val transactionFee = readDouble()
            val account = SavingsAccount(accountNumber, deposit, transactionFee)
            bank.addAccount(account)
            true
        }
        else -> return false
    }
}

fun operateAccount(bank: Bank){
    println("Digite o número da conta")
    val accountNumber = readLine()?.toIntOrNull() ?: 0
    val account = bank.searchAccount(accountNumber)
    if (account == null) {
        println("Conta não encontrada")
        return
    }
    println("a. Depósito\n" +
            "b. Saque\n" +
            "c. Transferência\n" +
            "d. Relatório\n" +
            "e. Retorna ao menu anterior")
    when (readLine()) {
        "a" -> {
            println("Qual o valor de depósito?")
            val amount = readLine()?.toDoubleOrNull()
            if (amount == null) {
                println("Valor inválido")
                return
            }
            account.deposit(amount)
            return
        }
        "b" -> {
            println("Quanto deseja sacar?")
            val amount = readLine()?.toDoubleOrNull()
            if (amount == null) {
                println("Valor inválido")
                return
            }
            account.withdraw(amount)
        }
        "c" -> {
            println("Digite o número da conta de destino")
            val destinationAccountNumber = readLine()?.toIntOrNull() ?: 0
            val destinationAccount = bank.searchAccount(destinationAccountNumber)
            if (destinationAccount == null) {
                println("Conta não encontrada")
                return
            }
            println("Qual o valor da transferência?")
            val amount = readLine()?.toDoubleOrNull()
            if (amount == null) {
                println("Valor inválido")
                return
            }
            account.wire(amount, destinationAccount)
            return
        }
        "d" -> account.show()
        "e" -> return
    }
}

fun deleteAccount(bank: Bank) {
    println("Digite o número da conta a remover")
    val accountNumber = readLine()?.toIntOrNull() ?: 0
    val account = bank.searchAccount(accountNumber)
    if (account == null) {
        println("Conta não encontrada")
        return
    }
    if (account.balance > 0) {
        println("Atenção! O saldo desta conta não é zero. Por favor saque todo o dinheiro antes de remover a conta")
        return
    }
    println("A conta ${account.accountNumber} tem saldo zero e pode ser apagada com segurança." +
            "Pressione 1 para apagá-la e 0 para retornar")
    if (readLine() != "1") return
    bank.removeAccount(account)
    println("Conta apagada")
    return
}

fun report(bank: Bank) {
    val size = bank.accounts.size
    var plural = "s"
    if (size == 1) plural = ""
    println("Há um total de $size conta$plural no banco")
    bank.show()
}

fun println(message: Any?){
    print("------------------\n$message\n")
}

fun readInt(): Int {
    val int = readLine()?.toIntOrNull()
    if (int == null) {
        println("Entrada inválida")
        return 0
    }
    return int
}
fun readDouble(): Double {
    val double = readLine()?.toDoubleOrNull()
    if (double == null) {
        println("Valor inválido")
        return 0.0
    }
    return double
}