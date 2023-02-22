fun main() {
    var counter = 1
    while(counter<=7){
        println("$counter Hello dunia")

        counter++
    }
    /*
    Berbeda dengan While, Do While bersifat Exit Controlled Loop
    di mana proses perulangan akan langsung dijalankan di awal.
    Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.
    * */
    do{
        println("$counter Hello dunia")
        counter++
    }while (counter <= 7 )
}