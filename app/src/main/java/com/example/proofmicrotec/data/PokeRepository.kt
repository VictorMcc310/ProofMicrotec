package com.example.proofmicrotec.data

import retrofit2.Call

class PokeRepository {
    private val api = PokemonService()

    suspend fun getPokemons(): String?{
        val response = api.getPok()
        return response
    }
}