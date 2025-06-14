package com.example.weatherapp.domain.usecase

import com.example.weatherapp.domain.api.FavouriteRepository
import com.example.weatherapp.domain.model.City
import javax.inject.Inject

class AddCityToFavouriteUseCase @Inject constructor(
    private val repository: FavouriteRepository,
) {

    suspend operator fun invoke(city: City) = repository.addToFavourite(city)
}