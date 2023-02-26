fun main() {
//    Lambda receiver (this)

//    Beberapa fungsi yang menggunakan lambda receiver adalah run, with, dan apply. Ketika ingin mengakses konteks dari sebuah objek, kita bisa saja tidak menuliskan atau menghilangkan kata kunci this. Misalnya seperti penggunaan fungsi apply berikut:
    val buildString = StringBuilder().apply{
        append("Kev")
        append("in ")
        append(" Alfito")
    }
    println(buildString)
//    Lambda argument (it)
//    Selanjutnya, fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also. Berbeda dengan lambda receiver, nilai dari argumen tersebut dapat kita gunakan untuk diproduksi atau di inisialisasikan untuk variabel lain. Contohnya seperti berikut:
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

}