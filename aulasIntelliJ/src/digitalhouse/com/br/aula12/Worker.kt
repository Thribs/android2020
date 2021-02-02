package digitalhouse.com.br.aula12

class Worker(val name: String, val workerID: Int) {
    override fun equals(other: Any?): Boolean {
        if(other is Worker) {
            return other.workerID == this.workerID
        }
        return false
    }
}