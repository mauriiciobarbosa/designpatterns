package designpatterns.observer

import designpatterns.observer.observers.*
import designpatterns.observer.subjects.WeatherData

fun main() {
    val weatherData = WeatherData()

    createDisplays(weatherData)

    weatherData.setMeasurements(80F, 65F, 30.4F)
    weatherData.setMeasurements(82F, 70F, 29.2F)
    weatherData.setMeasurements(78F, 90F, 29.2F)
}

private fun createDisplays(weatherData: WeatherData): List<DisplayElement> {
    val currentConditionDisplay = CurrentConditionDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)
    val heatIndexDisplay = HeatIndexDisplay(weatherData)
    return listOf(currentConditionDisplay, statisticsDisplay, forecastDisplay, heatIndexDisplay)
}