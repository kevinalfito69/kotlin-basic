class animalInfo(name:String, age:Int,isMammal:Boolean, weight:Double){
    val name: String
    val age: Int
    val isMammal:Boolean
    val weight: Double
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}

fun main() {
    val panda = animalInfo("panda",12, true, 0.1)
    println("Nama: ${panda.name}, Berat: ${panda.weight}, Umur: ${panda.age}, mamalia: ${panda.isMammal}")
}