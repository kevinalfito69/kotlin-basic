fun main() {
    /*Continue digunakan untuk melewatkan proses iterasi dan lanjut dengan proses iterasi berikutnya.
     Sementara itu, Break digunakan untuk menghentikan proses iterasi.*/
    val data = listOf(1,2,3,null,4,null, 7, 8)
    for(i in data){
        if(i == null) continue //break
        print(i)
    }
    /*Label pada Kotlin memiliki sebuah identifier yang diikuti dengan tanda @.
    Contoh dari sebuah label adalah foo@ atau bar@.*/

    loop@ for (i in 1..10){
        println("Outside loop")
        for( j in 1..10){
            println("Inside Loop")
            if(j>5) break@loop
        }
    }
}