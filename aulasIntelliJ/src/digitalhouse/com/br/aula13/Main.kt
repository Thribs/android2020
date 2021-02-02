package digitalhouse.com.br.aula13

fun main() {
    val thiagoPoupanca = SavingsAccount(2001,700.0, 2.0)
    val thiagoContaCorrente = CheckingAccount(1001,200.0,100.0)

    thiagoPoupanca.deposit(50.0)
    thiagoContaCorrente.deposit(200.0)
    thiagoPoupanca.withdraw(300.0)
    thiagoContaCorrente.withdraw(450.0)

    val relatorio = Report()
    relatorio.log(thiagoPoupanca)
    relatorio.log(thiagoContaCorrente)

    thiagoContaCorrente.deposit(950.0)
    thiagoContaCorrente.wire(500.0,thiagoPoupanca)
}