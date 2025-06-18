package com.example.weatherapp.domain.usecase

import com.example.weatherapp.domain.api.FavouriteRepository
import javax.inject.Inject

class RemoveCityFromFavouriteUseCase @Inject constructor(
    private val repository: FavouriteRepository,
) {

    suspend operator fun invoke(cityId: Int) = repository.removeFromFavourite(cityId)
}