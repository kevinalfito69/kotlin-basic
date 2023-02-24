/*
Sebelum mempelajarinya lebih dalam, ada baiknya jika kita tahu beberapa karakteristik dari lambda berikut:

Dalam menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya. Tipe tersebut akan ditentukan oleh kompiler secara otomatis.

Walaupun merupakan sebuah fungsi, lambda tidak membutuhkan kata kunci fun dan visibility modifier saat dideklarasikan, karena lambda bersifat anonymous.

Parameter yang akan ditetapkan berada di dalam kurung kurawal {}.

Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi karena kompiler akan secara otomatis mengembalikan nilai dari dalam body.

Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel.
* */

val lambdaPrintText = {println("Halo dunia ini adalah lambda")}
val lambaTextParameter = {text: String -> println("Halo semua nama saya adalah $text")}
val lambdaReturn = {text : String -> text.length}
fun main() {
    val textLength = lambdaReturn( "Kevin Alfito")

    println(textLength)
    lambdaPrintText()
    lambaTextParameter("Kevin ALfito")
}