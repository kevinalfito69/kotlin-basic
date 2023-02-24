fun main() {
    val ibuKota = mapOf(
        "Jakarta" to "Indonesia",
        "Kuala Lumpur" to "Malaysia",
        "Dubai" to "Uni Emirates",
        "London" to "england",
        "New Delhi" to "India"
    )
    println(ibuKota["Jakarta"])
    println(ibuKota.getValue("Jakarta"))
    println(ibuKota.keys)
    println(ibuKota.values)

//    Hasilnya sama saja. Namun sebenarnya terdapat sebuah perbedaan antara keduanya. Saat menggunakan simbol [ ] atau yang kita kenal dengan indexing, konsol akan menampilkan hasil null saat key yang dicari tidak ada di dalam Map. Sedangkan saat kita menggunakan getValue(), konsol akan memberikan sebuah Exception.

//    Mari kita ubah map capital yang sudah kita buat sebelumnya menjadi mutable.
    val mutableMap = ibuKota.toMutableMap()
    mutableMap["Amsterdam"] = "Netherlands"
    mutableMap.put("Berlin", "Germany")
    println(mutableMap.values)

}