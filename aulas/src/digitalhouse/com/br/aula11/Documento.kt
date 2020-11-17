package digitalhouse.com.br.aula11

class Documento(override val nome: String) : Imprimivel {
    override val tipo = "Documento"
    override fun imprimir() {
        println("Eu sou um $tipo e meu nome é $nome")
    }
}