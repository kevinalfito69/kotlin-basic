fun main() {
    val line = { value : String ->
        println("${"+".repeat(10)} $value ${"+".repeat(10)}")}
//    Langsung saja kita mulai dengan fungsi fold, kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan fungsi fold()
    line("fold")
 val number = listOf(1,2,3)

    val fold = number.fold(10){ current, item ->
        println("Current $current")
        println("Item $item")
        current + item
    }
    println("fold result $fold")
//    Selain itu, terdapat juga fungsi fold lainnya yaitu foldRight(). Berbeda dengan fungsi fold(), fungsi foldRight() akan melakukan proses iterasi dari indeks terakhir dan posisi dari argumen pada lambda expression nya pun berbeda, di mana argumen item berada pada posisi pertama dan argumen current berada pada posisi kedua.
val foldRight = number.foldRight(10){item, current ->
    println("current - $current")
    println("item - $item")
    current + item
    }
    println("fold right result $foldRight")
    line("Drop")
//     fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan.
    val numbers = listOf(1,2,3,4,5,6,7,8,10)
    println(numbers.drop(3))
    println(numbers.dropLast(3))
// take kebalikan dari drop
    line("Take")
    println(numbers.take(3))
    println(numbers.takeLast(3))

}