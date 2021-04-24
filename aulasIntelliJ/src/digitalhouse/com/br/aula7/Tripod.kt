package digitalhouse.com.br.aula7

class Tripod(var folded: Boolean, val minHeight: Double, val maxHeight: Double, private var height: Double) {
    fun setNewHeight(newHeight: Double){
        height = newHeight
    }
    fun fold(){
        folded = true;
    }
    fun unfold(){
        folded = false
    }
    fun putAway(){
        fold()
        height = minHeight
    }
    fun readyToPutAway(): Boolean{
        return folded && height == minHeight
    }
    fun use(){
        unfold()
        height = maxHeight/2
    }
    fun readyToUse(): Boolean{
        return !folded && height >= maxHeight/2
    }
}