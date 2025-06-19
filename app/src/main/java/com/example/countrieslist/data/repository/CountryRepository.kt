package com.example.countrieslist.data.repository

import com.example.countrieslist.data.api.CountryService
import com.example.countrieslist.data.model.CountryDto
import com.example.countrieslist.domain.model.Country
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CountryRepository {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://gist.githubusercontent.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var api = retrofit.create(CountryService::class.java)

    suspend fun getCountries(): List<Country> {
        return withContext(Dispatchers.IO) {
            val response = api.getCountries().execute()
            if (response.isSuccessful) {
                response.body()?.map { it.toDomainModel() } ?: emptyList()
            } else {
                emptyList()
            }
        }
    }

    private fun CountryDto.toDomainModel(): Country {
        return Country(
            name = name,
            region = region,
            code = code,
            capital = capital
        )
    }
}