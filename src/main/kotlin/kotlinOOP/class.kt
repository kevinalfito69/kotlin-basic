class AnimalInfo(
        val name : String,
        val age : Int,
        val isMamal : Boolean
        ){
    fun eat(){
        println("$name is Eat")
    }
    fun sleep(){
        println("$name is Sleep")
    }
    fun info (){
        val mamalia = if(isMamal)"He is mamalia" else "his Not mamalia"
        println("his name is : $name \n age : $age \n $mamalia")
    }
}
class GetSet(){
    var animal:String = "Kucing"
    get(){
        println("fungsi get terpanggil")
        return field
    }
        set(value){
            println("fungsi set terpanggil $value")
            field = value
        }
}
fun main() {
    val panda = AnimalInfo("Panda", 20, true)
    panda.info()
    val getSet = GetSet()
    println(getSet.animal)
    getSet.animal = "Kambing"
}