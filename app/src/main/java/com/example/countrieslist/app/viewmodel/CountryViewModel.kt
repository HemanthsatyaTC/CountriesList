package com.example.countrieslist.app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.countrieslist.domain.model.Country
import com.example.countrieslist.domain.usecase.GetCountriesUseCase
import kotlinx.coroutines.launch

class CountryViewModel : ViewModel() {

    val countriesLiveData = MutableLiveData<List<Country>>()
    var getCountriesUseCase = GetCountriesUseCase()

    init {
        fetchCountries()
    }

    fun fetchCountries() {
        viewModelScope.launch {
            val countries = getCountriesUseCase.execute()
            countriesLiveData.value = countries
        }
    }
}