package com.example.turistic

import java.io.Serializable

data class LugarTuristico(
    val nombreLugar:String,
    val nombreSitio:String,
    val descripcion: String,
    val breDescrip: String,
    val grados:Double,
    val estrellas: Double,
    //val imang:Int
):Serializable