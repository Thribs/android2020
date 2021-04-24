package digitalhouse.com.br.aula11

fun main() {
    val birthCertificate = Document("Certidão de nascimento")
    val selfPortrait = Picture("Selfie 16/11/2020")
    val contract = Contract("Liberação de firma")
    val canon3010 = Printer()
    canon3010.addItem(birthCertificate)
    canon3010.addItem(selfPortrait)
    canon3010.addItem(contract)
    canon3010.printAll()
}