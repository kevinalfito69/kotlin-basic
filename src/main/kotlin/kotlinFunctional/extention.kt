fun main() {
    10.printInt()
    val sumFive = 10.plusFive()
    println(sumFive)
    println(10.slice)
}

fun Int.printInt() {
    print("value $this")
}
fun Int.plusFive():Int{
    return this + 5

}
/*Extension Properties
Selanjutnya adalah extension properties. Seperti yang disebutkan di awal, Kotlin juga mendukung extension untuk menambah sebuah properti baru pada sebuah kelas tanpa harus menyentuh kode di dalam kelas tersebut.*/
val Int.slice: Int
    get() = this / 2