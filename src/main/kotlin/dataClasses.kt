fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser3.copy(Age = 90)

    println(dataUser4)
    println(dataUser)
    println(user)

}
class User(val Name: String, val Age:Int)
data class DataUser(val Name: String, val Age:Int)