package digitalhouse.com.br.aula11

class Contrato(override val nome: String) : Imprimivel {
    override val tipo = "Contrato"
    override fun imprimir() {
        println("Eu sou um $tipo e meu nome é $nome")
    }
}