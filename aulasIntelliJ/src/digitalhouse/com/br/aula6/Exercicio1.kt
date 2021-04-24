package digitalhouse.com.br.aula6

fun main(){
    val client1 = Client("Thiago", "Ribeiro", 26)
    val client2 = Client("Rafael", "Silva", 14)
    val account1 = Account(1, 0.0, client1)
    val account2 = Account(2, 100.0, client2)
    account1.deposit(50.0)
    account2.deposit(100.0)
    account1.withdraw(200.00)
    account2.withdraw(-30.0)
}