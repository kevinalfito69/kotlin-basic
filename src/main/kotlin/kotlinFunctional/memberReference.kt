fun main() {
    val countSum : (Int,Int)->Int = ::count
    println(countSum)

    val number = 1..10
    val eventNumber = number.filter(::isEventNumber)
    println(eventNumber)
//     Kode di atas ditulis dengan mekanisme Reflection yang berarti seperangkat fitur bahasa dan library yang memungkinkan kita untuk mengamati struktur kode dari proyek yang sedang kita kerjakan secara langsung.
}
fun count(valueA : Int, valueB : Int): Int{
    return valueA + valueB
}

//fun reference
fun isEventNumber(number : Int) = number % 2 == 0