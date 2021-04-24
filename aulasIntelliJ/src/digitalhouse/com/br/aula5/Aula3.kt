package digitalhouse.com.br.aula5

fun main() {
    println("Excercício 1:")
    ex1()
    println("Excercício 2:")
    ex2()
    println("Excercício 3:")
    ex3()
    println("Excercício 4:")
    ex4()
    println("Excercício 5:")
    ex5()
    println("Excercício 6:")
    ex6()
}

fun ex1() {
    val num1 = 2
    val num2 = 5
    val num3 = 4
    println(maxOf(num1, num2, num3))
}

fun ex2() {
    val str1 = "casa"
    val str2 = "casebre"
    println(str1 != str2)
}

fun ex3() {
    val num = 4.5
    println((num % 2) == 0.0)
}

fun ex4() {
    for (i in 1..100) {
        if ((i % 2) != 0) {
            print("$i, ")
        }
    }
    print("\n")
}

fun ex5() {
    val numA = 10
    val numB = 20
    val numC = 33
    val numD = 52
    println((numA > numC && numA > numD) || (numB > numC && numB > numD))
}

fun ex6() {
    var i = 0
    while (i <= 100) {
        print("$i, ")
        i++
    }
    print("\n")
}