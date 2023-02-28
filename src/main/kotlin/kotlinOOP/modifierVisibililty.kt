/*
Public: Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.

Private: Hak akses yang cakupannya paling terbatas. Anggota yang menerapkannya hanya dapat diakses pada scope yang sama.

Protected: Hak akses yang cakupannya terbatas pada hirarki kelas. Anggota hanya dapat diakses pada kelas turunannya atau kelas itu sendiri.

Internal: Hak akses yang cakupannya terbatas pada satu modul. Anggota yang menggunakannya tidak dapat diakses diluar dari modulnya tersebut.

*/
class Mamal(private  val name: String, val Age:Int, val isMamal:Boolean ){

    fun getName():String{
        return name
    }
}

fun main() {
    val cat = Mamal("Kucing",2,true)
    println(cat.getName())
}