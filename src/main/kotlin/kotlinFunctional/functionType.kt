fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    println(sum(10,20))

}
typealias Arithmetic = (Int,Int)-> Int

