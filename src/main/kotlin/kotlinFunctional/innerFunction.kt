fun main() {
val validate = validateData(10,10,10)
    println(validate)

}
fun validateData(valueA : Int, valueB : Int, valueC : Int):Int{
    fun validateZero(value:Int){
        if (value == 0){
            throw IllegalArgumentException("Value must be than 0")
        }
    }
    validateZero(valueA)
    validateZero(valueB)
    validateZero(valueC)
    return valueA * valueB * valueC
}