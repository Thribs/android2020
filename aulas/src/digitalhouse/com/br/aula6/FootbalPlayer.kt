package digitalhouse.com.br.aula6

class FootbalPlayer(val name: String, var stamina: Int, var joy: Int, var goals: Int, var experience: Int){
    fun score(){
        stamina -= 5
        joy += 10
        goals ++
        println("$name: GOAAAL!")
    }
    fun run(){
        stamina -= 10
        println("$name: I'm running and I'm tired")
    }
}