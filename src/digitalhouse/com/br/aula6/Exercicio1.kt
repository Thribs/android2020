package digitalhouse.com.br.aula6

fun main(){
    println("Conta: ")
    val client1 = Client("Thiago", "Ribeiro")
    val client2 = Client("Rafael", "Silva")
    var account1 = Account(1, 0.0, client1)
    print(account1)
    var account2 = Account(2, 100.0, client2)
}