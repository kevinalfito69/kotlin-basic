fun main() {
//    trailing lambda
 printResult(10){value -> value + value }
//    lambda biasa
    printResult(20, {value -> value * value})

//
//    val transform = hallo("KeVin", transformUpper)
//    println(transform)
}
inline fun printResult(value:Int, sum:(Int)->Int){
    val result = sum(value)
    println(result)
}

fun hallo (value:String, transform: (String)-> String):String{
    return transform(value)
}
/*
* Konsep ini dinamakan sebagai Higher-Order Function, yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya. Yang perlu diperhatikan adalah, jika argumen terakhir dari fungsi merupakan sebuah lambda expression, maka lambda expression tersebut ditempatkan di luar parenthesis seperti pada contoh kode di atas.*/


// INline
//Inline adalah fitur dalam bahasa Kotlin yang memungkinkan Anda untuk menyertakan seluruh kode dari suatu fungsi atau lambda (expression function) pada saat kompilasi, sehingga mempercepat waktu eksekusi program. Apabila kita periksa pada kode yang sudah di-decompile, hasilnya seperti berikut.