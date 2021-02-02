package digitalhouse.com.br.aula11

class Picture(override val name: String) : Printable {
    override val type = "Foto"
    override fun print() {
        println("Eu sou uma $type e meu nome é $name")
    }
}