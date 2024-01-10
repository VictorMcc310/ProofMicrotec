package com.example.proofmicrotec.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object HelperRetrofit {

    fun getRetrofit(): Retrofit {
      return Retrofit.Builder()
          .baseUrl( "https://pokeapi.co/api/v2/pokemon/")
          .addConverterFactory(ScalarsConverterFactory.create())
          .addConverterFactory(GsonConverterFactory.create()).build()
    }
}