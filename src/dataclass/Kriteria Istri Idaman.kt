package com.latihan.dataclass

// Jadi Inilah Class Yang Akan Kita ambil untuk function di dalam class dan akan di masukan ke panggil dalam
// Folder Fucntion Biasa

class `Kriteria Istri Idaman` {
// Ini adalah Membuat Properties di dalam class
    var yangPertama: String = ""
    var yangKedua: String = ""
    var yangKetiga: String = ""

// Ini Adalah MemBuat Function di dalam sebuah class Kriteria Istri Idaman
    fun harapanSatu(name: String ) {

        println("Harapan Saia Sih Yang Pertama yaitu $name Seorang $yangPertama ")

    }

    fun harapanKedua(name: String) {
        println("Dan Harapan Saia Yang Kedua Adalah semoga $name Pinter Banget Dah $yangKedua Buat Anak dan Juga Saia")
    }

    fun harapanKetiga(name: String) {
        println("Dan Harapan Terakhir Saia adalah Semoga si $name Berbakti dan Bersikap Bee Kepada $yangKetiga")
    }

}