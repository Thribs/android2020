package digitalhouse.com.br.aula10

fun main() {
    val vip = true
    var location = "superior"
    val ingressoIronMaiden = UpperBoxTicket(80.0, location, 20.0, 30.0)
    ingressoIronMaiden.printCost()
    location = "inferior"
    val ingressoVanHallen = lowerBoxTicket(60.0, location, 20.0)
    ingressoVanHallen.printCost()
}