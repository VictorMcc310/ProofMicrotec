package com.example.proofmicrotec.data


import retrofit2.http.GET

interface ApiClient {
    @GET("ditto")
    suspend fun getPokemon(): String?
}