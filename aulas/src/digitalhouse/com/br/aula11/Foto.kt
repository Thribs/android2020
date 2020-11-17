package digitalhouse.com.br.aula11

class Foto(override val nome: String) : Imprimivel {
    override val tipo = "Foto"
    override fun imprimir() {
        println("Eu sou uma $tipo e meu nome é $nome")
    }
}