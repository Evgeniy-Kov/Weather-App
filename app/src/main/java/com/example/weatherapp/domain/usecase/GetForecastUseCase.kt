package com.example.weatherapp.domain.usecase

import com.example.weatherapp.domain.api.WeatherRepository
import javax.inject.Inject

class GetForecastUseCase @Inject constructor(
    private val repository: WeatherRepository,
) {

    suspend operator fun invoke(cityId: Int) = repository.getForecast(cityId)
}