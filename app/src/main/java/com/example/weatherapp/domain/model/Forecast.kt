package com.example.weatherapp.domain.model

data class Forecast(
    val currentWeather: Weather,
    val upcoming: List<Weather>,
)
