import kotlin.reflect.typeOf

fun main(){
    val nome = "Lucas"
    //Java
    println("Olá "+ nome + "!")
    //Kotlin
    println("Olá $nome!")
    //Com expressões utilizar chaves {}
    println("A soma é: ${soma(10, 20)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b

}