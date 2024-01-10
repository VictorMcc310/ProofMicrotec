package com.example.proofmicrotec.data

import retrofit2.Call

class GetPokeUseCase {
    private val repository= PokeRepository()

    suspend operator fun invoke(): String?{
        return repository.getPokemons()
    }
}