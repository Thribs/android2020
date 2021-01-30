package digitalhouse.com.br.aula9.exercicio1

class Student(val studentID: Int,val name: String,val surname: String) {
    init {
        println("O aluno $name $surname se matriculou sob o RA $studentID.")
    }
    fun attendClass(classroom: Classroom, arrivalTime: Time){
        print("O aluno $name $surname chegou à aula de ${classroom.subject} às ${arrivalTime.hour}:${arrivalTime.minute}")
        if(arrivalTime.hour>classroom.startingTime.hour) {
            print(", com um atraso de ${arrivalTime.hour - classroom.startingTime.hour}horas")
            if (arrivalTime.minute > classroom.startingTime.minute) {
                println(" e ${arrivalTime.minute - classroom.startingTime.minute}minutos.")
                return
            }
            println('.')
            return
        }
        if(arrivalTime.minute>classroom.startingTime.minute){
            println(", com um atraso de ${arrivalTime.minute-classroom.startingTime.minute}minutos.")
        }
        println('.')
    }
    fun doHomework(classroom: Classroom){
        println("O aluno $name $surname está fazendo o dever-de-casa da aula de ${classroom.subject}.")
    }
    fun consultaRA(){
        println("O RA de $name $surname é $studentID.")
    }
}