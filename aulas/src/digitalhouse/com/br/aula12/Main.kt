package digitalhouse.com.br.aula12

fun main() {
    val p1 = Person("Thiago", "124-51")
    val p2 = Person("Rafael", "124-51")
    println(p1.equals(p2))
    val coca1 = Coca("190ml", 2.0)
    val coca2 = Coca("190ml", 3.5)
    println(coca1.equals(coca2))
    val listaAlunos = mutableListOf<Student>()
    listaAlunos.add(Student("Aline",201))
    listaAlunos.add(Student("Bruno",202))
    listaAlunos.add(Student("Thiago",203))
    listaAlunos.add(Student("William",204))
    val aluno = Student("Rafael",203)
    println(listaAlunos.contains(aluno))
    val listaFuncionarios = mutableListOf<Worker>()
    listaFuncionarios.add(Worker("Flavia", 101))
    listaFuncionarios.add(Worker("Mayra", 102))
    listaFuncionarios.add(Worker("Medhy", 103))
    listaFuncionarios.add(Worker("Tiago", 104))
    val worker = Worker("Thiago", 104)
    println(listaFuncionarios.contains(worker))
}