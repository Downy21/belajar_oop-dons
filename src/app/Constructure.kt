package com.latihan.app

import com.latihan.dataclass.Car

/**
 * Saat kita membuat Object, maka kita seperti memanggil sebuah function
 * Di dalam class Kotlin, kita bisa membuat Constructors, Constructors mirip seperti function yang
 * akan dipanggil saat pertama kali Object dibuat.
 * Mirip seperti di Function, kita bisa memberi parameter pada Constructors
 */

fun main() {

    val avanza = Car("Toyota")
    val mobilio = Car("Honda")



    println(avanza.brand)
    println(avanza.years)
    println(mobilio.brand)
    println(mobilio.years)




}