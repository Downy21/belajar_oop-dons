package com.latihan.dataclass

class Address(paramStreet: String , paramName: String , paramCountry: String) {


    init {
        println("Rumah Milea Telah Pindah ke $paramStreet dan Juga Dia sekarang mempunyai Seroang Suami yang bernama $paramName dan Dia Juga Tinggal di Negara $paramCountry ")
    }




    val jalan: String = paramStreet
    var name: String = paramName
    var country: String = paramCountry




}