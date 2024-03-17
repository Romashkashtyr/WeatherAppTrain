package com.example.weatherapptrain.Data



interface WeatherRepository {

    fun getCurrentWeather(location: String, callback: (CurrentInfoWeather) -> Unit)
}