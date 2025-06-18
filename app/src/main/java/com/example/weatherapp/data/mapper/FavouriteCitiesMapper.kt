package com.example.weatherapp.data.mapper

import com.example.weatherapp.data.local.model.CityDbModel
import com.example.weatherapp.domain.entity.City

fun City.toDbModel(): CityDbModel = CityDbModel(
    id = this.id,
    name = this.name,
    country = this.country
)

fun CityDbModel.toEntity(): City = City(
    id = this.id,
    name = this.name,
    country = this.country
)

fun List<CityDbModel>.toEntities(): List<City> = map { it.toEntity() }