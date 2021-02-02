package digitalhouse.com.br.aula12

class Coca(val volume: String, val price: Double) {
    override fun equals(other: Any?): Boolean {
        if(other is Coca) {
            return other.volume == this.volume
        }
        return false
    }
}