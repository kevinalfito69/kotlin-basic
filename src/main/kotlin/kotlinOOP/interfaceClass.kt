import java.util.Objects

/*
* Cara pembuatan sebuah interface mirip dengan membuat kelas.
* Pada umumnya penamaan sebuah interface dituliskan dengan awalan huruf I kapital.
* Hal ini tidak diharuskan secara sintaks tapi ini merupakan penerapan terbaik dalam penamaan sebuah interface.
*  Tujuannya agar dapat mudah membedakannya dengan kelas.
* */
interface IFly{
    val numberOfWings: Int
     fun Fly(){}

    }

//class Bird(override val numberOfWings: Int): IFly{
//    override fun Fly(){
//        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
//        else println("I'm Flying without wings")
//    }
//}
fun flyWithWings(bird: IFly){
    bird.Fly()
}

fun main() {
//    anonymous class
    flyWithWings(object : IFly{
        override fun Fly() {
            if(numberOfWings > 0) println("Flying with $numberOfWings wings")
            else println("I'm Flying without wings")
        }

        override val numberOfWings: Int
            get() = 2
    })
}
/*
Perhatikan bahwa kita tidak membuat class Bird lagi, tetapi langsung mendefinisikan isi dari kelas tersebut dengan menggunakan keyword object. Jika dilihat, memang tidak ada nama yang diberikan untuk object yang dibuat ini, inilah yang disebut dengan Anonymous Class.

Anda akan sering menemui konsep seperti ketika memasuki dunia pemrograman Android untuk melakukan perintah tertentu ketika ada aksi, seperti ketika tombol ditekan. Proses seperti ini juga sering disebut dengan listener atau callback.
* */

/*
myButton.setOnClickListener(object : OnClickListener{
    override fun onClick(p0: View?) {
        //melakukan perintah tertentu
    }
})
* */