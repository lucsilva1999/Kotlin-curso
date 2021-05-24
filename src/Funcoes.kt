import kotlin.reflect.typeOf

fun main() {
    val firstName = "Lucas"
    val lastName = "Silva"
    println("Olá $firstName $lastName, o resultado da função é: ${maxCrp(10, 5)} ")
    println("Olá $firstName $lastName, o resultado da função é: ${maxExp(10, 5)} ")
}

// Bloco de Corpos
// Função avançadas que pode ter várias expressões, validações ou valores
fun maxCrp(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Corpo de Expressão
// Função simples com até uma expressão, validação ou valor
fun maxExp(a: Int, b: Int): Int = if (a > b) a else b