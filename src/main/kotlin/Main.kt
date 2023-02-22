fun main() {
    val user = setUser("Alfian", 19)
    println(user)
    val nullPointer: String? = null
    if (nullPointer != null){
        val textLength = nullPointer.length
    }


    val kumpulanDataSiswa = arrayOf("Kevin Alfito", 20, "Cirebon")
    println(kumpulanDataSiswa[0])
//    printUser(kumpulanDataSiswa[0], kumpulanDataSiswa[1],kumpulanDataSiswa[2])
    val store = openStore(10, 9)
    println(store)
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String, umur: Int, alamat: String) {
    println("Your name is $name, age : $umur address: $alamat")

}

fun openStore(now: Int, openHours: Int): String {
    val office: String
    if (now > openHours) {
        office = "Office already open!"
    } else if (now == openHours) {
        office = "Wait a minute, Office will open"
    } else {
        office = "Office is closed"
    }
    return office
}