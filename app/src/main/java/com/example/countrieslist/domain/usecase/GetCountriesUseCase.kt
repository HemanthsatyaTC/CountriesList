package com.example.countrieslist.domain.usecase

import com.example.countrieslist.data.repository.CountryRepository
import com.example.countrieslist.domain.model.Country

class GetCountriesUseCase {
    private val countryRepository = CountryRepository()

    suspend fun execute(): List<Country> {
        return countryRepository.getCountries()
    }
}