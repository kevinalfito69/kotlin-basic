fun main() {
    val numberArray = intArrayOf(10, 20, 30, 40)

    val number = sumNumbers("Kevin", 1,2,3,4,5,6,*numberArray)
    println(number)
}
fun sumNumbers(teks: String, vararg number:Int):String{
    return "Ini adalah $teks hasilnya ${number.sum()}"
}
/*Lalu kapan kita membutuhkan vararg?  Ketika sebuah fungsi yang menggunakannya tidak mengetahui jumlah argumen yang akan disematkan ketika fungsi tersebut dipanggil.*/
// Konsep vararg mirip Spread syntax ... pada JavaScript
// Dalam penggunaannya, terdapat aturan yang perlu kita ketahui. Pertama, di dalam sebuah fungsi, tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg.
/* jika kita ingin menambahkan parameter baru tanpa kata kunci vararg, parameter yang ditandai dengan vararg sebaiknya berada pada posisi terakhir. */