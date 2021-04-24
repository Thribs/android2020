package digitalhouse.com.br.aula7

fun main() {
    val tripod = Tripod(false, 10.0, 20.0, 20.0)
    tripod.putAway()
    println(tripod.readyToPutAway())
    tripod.use()
    println(tripod.readyToUse())
}