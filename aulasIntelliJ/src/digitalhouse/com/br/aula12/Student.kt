package digitalhouse.com.br.aula12

class Student(val name: String, val studentID: Int) {
    override fun equals(other: Any?): Boolean {
        if(other is Student) {
            return other.studentID == this.studentID
        }
        return false
    }
}