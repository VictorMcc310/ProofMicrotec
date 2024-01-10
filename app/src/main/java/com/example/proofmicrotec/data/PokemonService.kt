package com.example.proofmicrotec.data

import com.example.proofmicrotec.core.HelperRetrofit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call

class PokemonService {
    private val retrofit = HelperRetrofit.getRetrofit()

    suspend fun getPok(): String?{
        return withContext(Dispatchers.IO){
             retrofit.create(ApiClient::class.java).getPokemon()
        }
    }
}