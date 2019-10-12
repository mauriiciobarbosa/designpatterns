package designpatterns.observer.observers

import designpatterns.observer.subjects.WeatherData

class StatisticsDisplay(
    weatherData: WeatherData
) : Observer, DisplayElement {

    private var maxTemp = Float.MIN_VALUE
    private var minTemp = Float.MAX_VALUE
    private var tempSum = 0F
    private var numReadings = 0
    private val avgTemp: Float
        get() = tempSum / numReadings

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        tempSum += temp
        numReadings++

        if (temp > maxTemp) maxTemp = temp
        if (temp < minTemp) minTemp = temp

        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = $avgTemp/$maxTemp/$minTemp")
    }
}