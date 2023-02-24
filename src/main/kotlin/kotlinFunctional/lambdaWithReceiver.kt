fun main() {
    val message = buildString {
        append("Hello")
        append("Wo")
        append("rd")
    }
    println(message)

}
fun buildString(action:StringBuilder.()->Unit):String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}