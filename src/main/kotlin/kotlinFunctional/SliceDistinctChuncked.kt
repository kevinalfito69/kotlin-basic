fun main() {
    val line = { value : String ->
        println("${"+".repeat(10)} $value ${"+".repeat(10)}")}
//    Dalam penggunaannya, fungsi slice() membutuhkan sebuah argumen berupa Range yang digunakan untuk menentukan posisi pertama dan terakhir yang akan disaring.
    line("Slice")
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val index = listOf(2, 3, 5, 8)
    println(total.slice(4..7))
    println(total.slice(4..9 step 2))
    println(total.slice(index))
    /*   Saat berurusan dengan item yang sama di dalam sebuah collection,
     untuk menyaring item yang sama tersebut kita akan melakukan iterasi dan membandingkan setiap itemnya.
      Namun dengan Kotlin kita tidak perlu melakukannya secara manual,
      karena Kotlin Collection menyediakan fungsi untuk melakukannya dengan mudah yaitu fungsi distinct().*/
    val totalEquals = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val totalEqualsLength = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    line("Distinct")

    println(totalEquals.distinct())

//    kita bisa juga menentukan proses penyaringan item yang sama seperti apa yang akan dijalankan dengan menggunakan fungsi distinctBy().
    println(totalEqualsLength.distinctBy { it.length })
    line("Chunked")
    // chunked() bisa kita gunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array.

    val name = "KevinAlfito"
    println(name.chunked(3))
    println(name.chunked(3){it.toString().lowercase()})


}