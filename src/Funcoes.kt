import kotlin.reflect.typeOf

fun main() {
    val firstName = "Lucas"
    val lastName = "Silva"
    println("Olá $firstName $lastName, o resultado da função é: ${max(10, 5)} ")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}