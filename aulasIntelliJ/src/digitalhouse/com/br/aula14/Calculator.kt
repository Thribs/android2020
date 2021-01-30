package digitalhouse.com.br.aula14

class Calculator : Operations{
    override fun sum(a: Double, b: Double): Double {
        return a+b
    }

    override fun subtract(a: Double, b: Double): Double {
        return a-b
    }

    override fun multiply(a: Double, b: Double): Double {
        return a*b
    }

    override fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            println("Erro. Divisão por zero")
            return 0.0
        }
        return a/b
    }
    fun fancySum(a: Double, b: Double): Double {
        return 0.0
    }
    fun fancySubtract(a: Double, b: Double): Double {
        return 0.0
    }
    fun fancyMultiply(a: Double, b: Double): Double {
        return 0.0
    }
    fun fancyDivide(a: Double, b: Double): Double {
        return 0.0
    }

}