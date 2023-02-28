package generic

import generic.List

/*Dalam penerapan generic, kita bisa membatasi tipe apa saja yang dapat digunakan sebagai parameter.
 Untuk menentukkan batasan tersebut, bisa dengan menambahkan tanda titik dua (:)
setelah tipe parameter yang kemudian diikuti oleh tipe yang akan dijadikan batasan.
 Contohnya seperti berikut:*/

class ListNumber<T:Number> : List<T>{
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}
// Contoh lain dari constraint type parameter adalah seperti berikut:
fun <T :Number> List<T>.sumNumber():T{
    TODO("Not yet implemented")
}
/*
Fungsi di atas merupakan extensions function dari kelas List yang mempunyai tipe parameter.
Sama seperti deklarasi generic pada sebuah fungsi, tipe parameter T pada fungsi tersebut juga akan digunakan sebagai receiver dan return type.
Perbedaannya terletak pada cara memanggilnya. Fungsi tersebut akan tersedia pada variabel List dengan tipe argumen yang memiliki supertype Number.
* */
fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
}