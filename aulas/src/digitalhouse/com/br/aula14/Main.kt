package digitalhouse.com.br.aula14

/*
Crie uma calculadora:
Sua calculadora deve ser capaz de realizar operações matemáticas recebendo 2 parâmetros de entrada e retornando o resultado da operação.
Implemente as operações de soma, subtração, multiplicação e divisão.
Teste sua calculadora na função main (a calculadora deve executar as operacoes).
Agora na sua função main crie lambda functions para cada uma das operações matemáticas sem a utilização de interfaces.
Teste sua nova calculadora sem utilizar interfaces.
 */

fun main() {
    val calculator = Calculator()
    val a = 10.0
    var b = 2.0
    println(calculator.sum(a, b))
    println(calculator.subtract(a, b))
    println(calculator.multiply(a, b))
    println(calculator.divide(a, b))
    b = 0.0
    println(calculator.divide(a, b))
}