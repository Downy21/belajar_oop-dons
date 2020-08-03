package com.latihan.dataclass

class Car (paramBrands: String , paramYears: Int = 2020 ){

    init {
        println("Pada Tahun $paramYears Car $paramBrands Di Buat")
    }

    var brand: String = paramBrands
    var years: Int = paramYears




}





