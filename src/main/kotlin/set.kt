fun main() {
    /*Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
    Ini akan berguna ketika Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection.
    Kita bisa mendeklarasikan sebuah Set dengan fungsi setOf.*/

    val uuidUserA = setOf(2019,1212,1212,1212,219,290,260)
    val uuidUserB = setOf(2019,1212,1212,1212,260, 124)

    println( 124 in uuidUserB)

//    fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set.
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

//    Pada Mutable Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List.
    val mutableSet = mutableSetOf(1,2,3,4,1,3)
    mutableSet.add(9)// menambah item di akhir set
    mutableSet.remove(0)

}