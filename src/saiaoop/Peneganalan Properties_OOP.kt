package com.latihan.saiaoop

import com.latihan.dataclass.Person

/**
 * Properties / Fields / Attributes adalah data yang bisa kita sisipkan di dalam Object
 * Namun sebelum kita bisa memasukkan data di Properties, kita harus mendeklarasikan data apa aja
   yang dimiliki object tersebut di dalam deklarasi class-nya
 * Membuat Properties sama seperti membuat variable, bisa mutable atau immutable

 */


/** Dan Kita Juga Dalam Membuat Properties Kita Bisa Memanipulasi Data di dalam Class
 * Properties yang ada di object, bisa kita manipulasi. Tergantung mutable atau immutable.
 * Jika mutable, berarti kita bisa mengubah data properties nya, namun jika immutable, kita hanya bisa mengambil data properties nya saja
 * Untuk memanipulasi data properties, sama seperti cara pada variable
 * Untuk mengakses properties, kita butuh kata kunci . (titik) setelah nama object dan diikuti nama properties nya
 */


// Contoh dari manipulasi Properties Di dalam Class seperti di bawah ini :)

fun main() {

   var nama = Person()
   nama.firstName = "Munaroh"
   nama.midleName = "Milea"
   nama.lastName= "Karina"

   println(nama.firstName )
   println(nama.midleName)
   println(nama.lastName)



}



