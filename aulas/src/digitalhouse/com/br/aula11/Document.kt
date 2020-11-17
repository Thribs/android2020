package digitalhouse.com.br.aula11

class Document(override val name: String) : Printable {
    override val type = "Documento"
    override fun print() {
        println("Eu sou um $type e meu nome é $name")
    }
}