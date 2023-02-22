fun main() {
    val bioData = Bio("Kevin", 29)


    bioData.intro()

}
data class Bio(val name: String, val age:Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}