fun main() {
    val range = 1..6
    for (i in range){
        println("$i Hello Dunia")
    }
    for ((index, value) in range.withIndex()){
        println("Index nya adalah : $index Valuenya : $value")
    }
// Foreach
    val array = arrayOf("Kevin", "Juki", "Luki", "Lily Jamet")
    array.forEachIndexed{ index, value ->
        println("${index+1}. $value")
    }
}