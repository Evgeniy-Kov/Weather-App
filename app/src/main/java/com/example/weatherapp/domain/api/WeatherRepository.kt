package com.example.weatherapp.domain.api

import com.example.weatherapp.domain.model.Forecast
import com.example.weatherapp.domain.model.Weather

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
}