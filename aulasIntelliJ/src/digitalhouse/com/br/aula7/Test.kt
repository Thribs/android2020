package digitalhouse.com.br.aula7

class Test(private val difficulty: Int, private val neededStamina: Int) {
    fun canDo(athlete: Athlete): Boolean{
        return athlete.stamina >= neededStamina && athlete.level >= difficulty
    }
}