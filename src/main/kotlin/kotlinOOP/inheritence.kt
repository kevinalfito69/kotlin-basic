open class Food(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){
    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }

}
class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int):Food(pName, pWeight, pAge, pIsCarnivore){

    fun playWithHuman(){
        println("$name bermain dengan manusia")
    }

    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }

}

fun main() {
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
}