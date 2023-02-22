fun main() {
    val listData = listOf("Kevin Alfito",20,"Dimas Bek", 30)
    val dataName = mutableListOf("Kevin Bek", "Dimas Syah", "Andy Wibu")
    dataName.add("Kevin Mitnic") // Menambahkan data pada akhir List
    dataName.add(1, "Lily Anak Rajin") // menambah data ke index 1
    dataName[0] = "Dimas sanjaya" // Mengubah data list di index 0
    dataName.removeAt(2) // Menghapus data pada List di index 2
    println(dataName[1])
    println(listData[2])
}