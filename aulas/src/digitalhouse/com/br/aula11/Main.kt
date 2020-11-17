package digitalhouse.com.br.aula11

fun main() {
    val documento = Documento("Certidão de nascimento")
    val foto = Foto("Selfie 16/11/2020")
    val contrato = Contrato("Liberação de firma")
    val impressora = Impressora()
    impressora.novoItem(documento)
    impressora.novoItem(foto)
    impressora.novoItem(contrato)
    impressora.imprimirTodos()
}