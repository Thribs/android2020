package digitalhouse.com.br.aula9.exercicio2

fun main() {
    val compras = mutableListOf(
            Product(101, "Caixa de leite desnatado", 2, 3.00),
            Product(301, "Pacote de bolhachas", 1, 2.00)
    )
    val fatura = Invoice(compras)
    fatura.printInvoiceTotal()
    val acucar = Product(201, "Saco de açúcar de 5kg", 1, 4.0)
    compras.add((acucar))
    fatura.printInvoiceTotal()
}
