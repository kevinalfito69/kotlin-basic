/*
ikan dan ular seperti apa tetapi tidak untuk hewan.
Maka dari itu konsep abstract class perlu diterapkan agar kelas Animal tidak dapat direalisasikan dalam bentuk objek
namun tetap dapat menurunkan sifatnya kepada child class-nya.


* */
abstract class AnimalAbstract(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}