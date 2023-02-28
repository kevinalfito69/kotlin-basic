package generic

fun main() {
    val longArrayList = ArrayList<Long>()
    val longList = LongList()
}
interface List<T>{
    operator fun get(index:Int):T
}
class LongList:List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}
class ArrayList<T>: List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}
