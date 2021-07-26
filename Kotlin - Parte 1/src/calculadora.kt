import java.math.BigDecimal

fun calcularOperacao(primeiroNumero: BigDecimal, operacao: String, segundoNumero: BigDecimal): BigDecimal {
    when(operacao) {
        "+" -> return primeiroNumero + segundoNumero
        "-" -> return primeiroNumero - segundoNumero
        "*" -> return primeiroNumero * segundoNumero
        "/" -> return primeiroNumero / segundoNumero
        "%" -> return primeiroNumero % segundoNumero
        else -> return BigDecimal.ZERO
    }
}

fun main() {
    println("Digite um número: ")
    val primeiroNumero = readLine()?.toBigDecimalOrNull()

    if (primeiroNumero == null) {
        println("Primeiro número informado inválido")
        return
    }
    println("Digite um operador (+,-,*,/,%): ")
    val operador = readLine()

    if (operador.isNullOrEmpty() || operador.isNullOrBlank() ||
       (operador != "+" && operador != "-" && operador != "*"
       && operador != "/" && operador != "%")) {
        println("Operador inválido")
        return
    }
    println("Digite outro número: ")
    val segundoNumero = readLine()?.toBigDecimalOrNull()

    if (segundoNumero == null) {
        println("Segundo número informado inválido")
        return
    }
    val  resultado = calcularOperacao(primeiroNumero, operador, segundoNumero)
    println("O resultado da operação é: $resultado")
}