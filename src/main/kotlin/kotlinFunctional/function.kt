fun main() {
//    named argument
    val biodata = bioData( address = "Cirebon", age = 20)
    println(biodata)


}
fun bioData(name:String = "anonymous", age:Int,address: String):String{
    return "Hallo nama saya $name umur saya $age dan saya tinggal di $address"
}
