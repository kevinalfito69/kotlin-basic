fun main() {
    val listNumber = (1..5000).toList()
    listNumber.filter { it % 5 == 0 }.map { it * 2 }.forEach{ print("$it,") }

    println()
    listNumber.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { print("$it,") }
    /*Dengan sequence, operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1.
    Karena tidak memenuhi kondisi pada filter maka operasi tidak akan dilanjutkan ke map().
    Sampai dengan iterasi ke-5 akan dilakukan mapping, angka 5 akan dikalikan 2 dan ditampilkan pada konsol,
    setelah itu akan dilanjutkan ke iterasi berikutnya sampai dengan iterasi ke-1 juta.
    Untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library yaitu generateSequence().*/

    val sequencesData = generateSequence(1) { it + 1  }
    sequencesData.take(5).forEach { println(it) }
}