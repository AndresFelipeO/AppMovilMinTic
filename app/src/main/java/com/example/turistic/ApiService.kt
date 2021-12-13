package com.example.turistic

import retrofit2.http.GET

interface ApiService {
    @GET("/XAndresXx/Movil-tic-infor/point")

    suspend fun resquestSitios(): List<LugarTuristico>
}