fun main() {
    /*Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
    Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null.
    Contohnya seperti di bawah ini:*/
    val message: String? = null

    message?.let{
        val lenght = it.length * 2
        println("Lenght is $lenght")
    }?:run{
        println("Object is null")
//    elvis operator berguna ketika kondisi output null
    }

    /* Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek.
    Namun untuk konteks objeknya tersedia sebagai argumen (it).
    Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya. */
    val text = "Hello Kotlin"
    val result = text.also {

        println("Text is $it and lenght is ${it.length}")
    }
    println(result)
}