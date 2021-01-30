package digitalhouse.com.br.aula11

class Printer() {
    val printerSpool = mutableListOf<Printable>()
    fun addItem(file: Printable){
        printerSpool.add(file)
    }
    fun printAll(){
        for (f in printerSpool){
            f.print()
        }
    }
}