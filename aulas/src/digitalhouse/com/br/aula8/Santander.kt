package digitalhouse.com.br.aula8

fun main() {
    val thiago = Client(1,"Ribeiro",500,800)
    val rafael = Client(2, "Silva", 600, 900)
    var contaThiago = CheckingAccount(100.0,0.0,thiago)
    var contaRafael = SavingsAccount(.05, 200.0, rafael)
    contaThiago.withdraw(20.0)
    contaThiago.withdraw(100.0)
    contaRafael.withdraw(300.0)
    val check10112020 = Check(200.0,"Nubank",Date(10,11,2020),thiago)
    contaThiago.depositCheck(check10112020)
    contaRafael.collectInterest()
    contaRafael.deposit(500.00)
    contaThiago.withdraw(100.0)
    contaRafael.withdraw(300.0)
}