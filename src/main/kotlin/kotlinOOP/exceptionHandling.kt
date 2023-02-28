package kotlinOOP

fun main() {
    val someNullValue: String? = null
     var someNotNullVAlue:String
//    try-catch
    try{
        someNotNullVAlue = someNullValue!!
        println(someNotNullVAlue)
    }catch (e: Exception){
        someNotNullVAlue = "Nilai Null"
        println(someNotNullVAlue)
    }
//    try-catch-finally
    try {
        someNotNullVAlue = someNullValue!!
    } catch (e: Exception) {
        someNotNullVAlue = "Nilai String Null"
    } finally {
        println(someNotNullVAlue)
    }
//    Multiple Catch
    val someStringValue: String? = null
    var someIntValue: Int = 0
    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}