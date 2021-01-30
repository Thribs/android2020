package digitalhouse.com.br.aula9.exercicio3

class Stock(var name: String, var currentStock: Int, var minStock: Int){
    init {
        if(currentStock<0){
            currentStock = 0
        }
        if(minStock<0){
            minStock=0
        }
        show()
    }
    fun changeName(newName: String){
        name = newName
        println("O nome do produto foi alterado para $name.\n")
    }
    fun changeMinStock(newMinStock: Int){
        minStock = newMinStock
        println("Estoque mínimo alterado para $minStock.\n")
    }
    fun restock(quantity: Int){
        currentStock += quantity
        var one = "s"
        if(quantity==1){
            one = ""
        }
        println("Adicionado $quantity unidade$one de $name.\n")
    }
    fun checkout(quantity: Int){
        if (quantity<=currentStock){
            currentStock -= quantity
            var one = "s"
            if(quantity==1){
                one = ""
            }
            println("$quantity unidade$one de $name vendida$one.\n")
            return
        }
        println("Estoque insuficiente.\n")
    }
    fun needsRestocking(): Boolean{
        if(currentStock<minStock){
            return true
        }
        return false
    }
    fun show(){
        println("Produto: $name; Quantidade: $currentStock/$minStock")
        var needsTrue = "não "
        var needsFalse = ""
        if(needsRestocking()){
            needsTrue = ""
            needsFalse = "não "
        }
        println("O produto ${needsFalse}tem estoque suficiente e ${needsTrue}precisa ser reposto.\n")
    }
}