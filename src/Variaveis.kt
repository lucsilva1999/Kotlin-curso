import kotlin.reflect.typeOf

fun main() {
   var idade = 1
    while (idade < 5) {
        idade++
        println("O valor atual da variável idade é ${idade}")
    }

    //VAL = imutávels
    //VAR = mutávelss

    //Inferência do Tipo.
    val fruta = "Abacaxi"

    //Declaração do tipo.
    var fruta2 = "Banana"
    println("A variável ${idade} é do tipo ${idade::class.simpleName}")
    println("A variável imutável ${fruta} é do tipo: ${fruta::class.simpleName}")
    println("A variável mutável ${fruta2} é do tipo: ${fruta::class.simpleName}")
    println("O valor imutável é ${fruta} e o valor mutável é ${fruta2}")

}