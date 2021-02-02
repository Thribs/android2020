package digitalhouse.com.br.aula7

fun main(){
    val daniele = Athlete("Daniele", 5, 100)
    val diego = Athlete("Diego", 5, 100)
    val cavalo = Test(3, 10)
    val barraLateral = Test(5,20)
    val triploTwistCarpado = Test(10, 50)
    println(cavalo.canDo(daniele))
    println(cavalo.canDo(diego))
    println(barraLateral.canDo(daniele))
    println(barraLateral.canDo(diego))
    println(triploTwistCarpado.canDo(daniele))
    println(triploTwistCarpado.canDo(diego))
}