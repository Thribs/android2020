package digitalhouse.com.br.aula9.exercicio3

fun main() {
    val estoqueMupy = Stock("Mupy", -2, 50)
    estoqueMupy.checkout(10)
    estoqueMupy.restock(8)
    estoqueMupy.checkout(3)
    estoqueMupy.changeName("Mupy sabor Morango")
    estoqueMupy.changeMinStock(10)
    estoqueMupy.restock(20)
    estoqueMupy.show()
}