package digitalhouse.com.br.aula9.exercicio2

class Product(var id: Int, val description: String, var quantity: Int, var price: Double) {
    init {
        if(quantity<0){
            quantity=0
        }
        if(price<0.0){
            price = 0.0
        }
        println("$quantity - $description(código $id): $price")
    }
}
