package com.example.weatherapp.domain.api

import com.example.weatherapp.domain.model.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}