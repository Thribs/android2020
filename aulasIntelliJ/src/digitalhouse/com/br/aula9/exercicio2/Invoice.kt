package digitalhouse.com.br.aula9.exercicio2

class Invoice(val productsList: MutableList<Product>) {
    fun printInvoiceTotal(){
        var total = 0.0
        for(p in productsList){
            total += p.price*p.quantity
        }
        println("O total fatura é R$${total}0.")
    }
}