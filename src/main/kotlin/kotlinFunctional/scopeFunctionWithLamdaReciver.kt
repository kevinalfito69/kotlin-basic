


fun main() {
/*Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian.
Contoh penggunaannya seperti berikut:*/
    val text = "Hallo"
    text.run{
        val from = this
        val to = this.replace("Hallo","Kotlin")
        println("Replace text variable from $from to $to")
    }
    /*Selanjutnya fungsi with. Pada dasarnya fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa.
     Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver.
     Contohnya seperti berikut:*/
    val withText = "Message"
    val result = with(withText){
        println("the value is $this")
        println("First text is ${this[0]}")
    }

    /*Berbeda dengan fungsi-fungsi sebelumnya, nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this).
     Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.
     Perhatikan kode berikut:*/

    val messageApply = StringBuilder().apply{
        append("Hallo ")
        append("Dunia")
    }
    println(messageApply)

}