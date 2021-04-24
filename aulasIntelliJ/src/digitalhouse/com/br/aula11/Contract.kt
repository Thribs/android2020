package digitalhouse.com.br.aula11

class Contract(override val name: String) : Printable {
    override val type = "Contrato"
    override fun print() {
        println("Eu sou um $type e meu nome é $name")
    }
}