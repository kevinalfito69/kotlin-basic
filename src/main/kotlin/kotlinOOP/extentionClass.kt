class Animal(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)
val Animal.getAnimalInfo : String
get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"
// Dengan menambahkan Extension properties getAnimalInfo pada kelas Animal, maka kita dapat menggunakan properti tersebut pada sebuah objek kelas Animal.
fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)
}