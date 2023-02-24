fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    Filter
    val eventList = numberList.filter { it  % 3 == 0 }
    val notEventList = numberList.filterNot { it  % 3 == 0 }
//    Selain itu kita juga dapat mem-filter list berdasar hasil yang tak sesuai dengan kondisi yang diberikan.
    println(eventList)
    println(notEventList)

/* map
 Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.*/
   val mapList = numberList.map { it * 10 }
    println(mapList)

//    it pada kode di atas akan merepresentasikan masing masing item pada numberList.

//    COunt berfungsi untuk menghitung jumlah item yang berada pada collection
    println(numberList.count())
// find(), firstOrNull(), & lastOrNull()
    val findList = numberList.find { it % 2 == 1 }
    val firstOrNull = numberList.lastOrNull() { it > 3 }
    println(firstOrNull)
/*Tidak seperti fungsi filter() atau map() yang akan melakukan iterasi terhadap seluruh item, fungsi find() dan firstOrNull() ini akan langsung mengembalikan nilai ketika kondisi terpenuhi. Kemudian jika Anda ingin mencari item terakhir, gunakan fungsi lastOrNull().*/

//    first() & last()
/*Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection. Kita juga bisa menambahkan sebuah kondisi dengan parameter lambda. Namun perlu diperhatikan jika kita menambahkan kondisi padahal kondisi tersebut tidak terpenuhi, apa hasilnya? Exception! */
    val moreThan10 = numberList.first { it > 1 }
    println(moreThan10)

//    sum
    println(numberList.sum())

    /*sorted() digunakan untuk mengurutkan item yang ada di dalam collection.*/
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    println(kotlinChar.sorted())
    println(kotlinChar.sortedDescending())
}