package digitalhouse.com.br.aula9.exercicio1

fun main() {
    val oop = Classroom("OOP", Time(19,30),Time(21,45))
    val kotlin = Classroom("Kotlin", Time(19,30),Time(21,45))
    val thiago = Student(1, "Thiago", "Ribeiro")
    val jessica = Student(2, "Jessica","Fernandes")
    val jose = Teacher(1, "José")
    val aulas1Sem = arrayListOf(oop, kotlin)
    val alunosAndroid = arrayListOf(jessica, thiago)
    val android = Course("Desenvolvimento Android", aulas1Sem,alunosAndroid, jose)
    val classOf2020 = Class("Turma de 2020", android)
    jessica.attendClass(kotlin, Time(19,30))
    thiago.attendClass(kotlin,Time(19,32))
}