package com.latihan.app

import com.latihan.dataclass.User

fun main() {

   var user1 = User("Doni","SangatRahasia123")  // Deklarasi Awal
   var user2 =User("RidoRoma","1234YYYY") // Deklarasi Awal

    user1.username = "DoniChan" // Merubah Value Deklarasi Di Atas
    user1.passwords = "Sangat Rahasia123" // Merubah Deklarasi Value Di atas

    user2.username = " RidoRoma12" // Merubah Deklarasi Value user 2 Di atas
    user2.passwords = "123DDDDD" // Merubah Deklarasi Value User 2  Di atas


    // Memprintln Username Dan Passwords
    println(user1.username)
    println(user1.passwords)
    println(user2.username)
    println(user2.passwords)




}