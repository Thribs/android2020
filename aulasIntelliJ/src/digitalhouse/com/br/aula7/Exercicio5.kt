package digitalhouse.com.br.aula7

fun main() {
    val veibras = Dealership("Veibras", 0, 0.0)
    val corsa2006 = Car("Chevrolet", "Corsa", 2006, "Verde Era", 30000.0)
    val palio2004 = Car("Fiat","Palio",2004,"Carmim", 42000.0)
    val thiago = Client("Thiago","Ribeiro","https://github.com/Thribs")
    veibras.newSale(corsa2006, thiago, 28000.0)
    veibras.newSale(palio2004, thiago, 22000.0)
}
