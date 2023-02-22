import kotlin.random.Random
// if expression sebaiknya digunakan ketika kondisi yang diberikan tidak lebih dari 2 (dua) dan kondisi yang diberikan tidak terlalu rumit.
fun main() {
    val namaKelasA3: String = "Bakso Alfito"
    when(namaKelasA3){
        "Kevin Alfito" -> print("Kevin In Here")
        "Yudi lagu" -> print("Yudi In Here")
        "Bakso Alfito" -> print("Bakso In Here")
        else -> print("Your search is not here")
    }

    val value = 7900

//    Jika kita memiliki dua atau lebih baris kode yang akan kita jalankan di setiap branch, kita bisa memindahkannya ke dalam curly braces seperti berikut:
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)

}
fun getRegisterNumber() = Random.nextInt(100)