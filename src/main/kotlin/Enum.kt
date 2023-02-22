fun main() {
    val colors = Color.values()
    colors.forEach { color ->
        print("$color \n")
    }
    val greenColor: Color = Color.GREEN
    println("Position GREEN is ${greenColor.ordinal}")
    when(greenColor){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }

    val redColor : Color = enumValueOf("RED")
    val blueColor = Color.valueOf("BLUE")
    println(blueColor.value.toString(16))
}
/*
Perhatikan. Untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi values(). Sedangkan untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi valueOf()
* */

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);


}