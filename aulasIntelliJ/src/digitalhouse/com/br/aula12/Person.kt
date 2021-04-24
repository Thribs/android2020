package digitalhouse.com.br.aula12

class Person(val name: String, val idNumber: String) {
    override fun equals(other: Any?): Boolean {
        if(other is Person) {
            return other.idNumber == this.idNumber
        }
        return false
    }
}