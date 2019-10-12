package designpatterns.observer.observers

import designpatterns.observer.subjects.WeatherData

class ForecastDisplay(
    weatherData: WeatherData
) : Observer, DisplayElement {

    private var currentPressure = 29.92f
    private var lastPressure = currentPressure

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display() {
        val displayMessage = if (currentPressure > lastPressure) {
            "Improving the weather on the way!"
        } else if (currentPressure < lastPressure) {
            "Watch out for cooler, rainy weather"
        } else {
            "More of the same"
        }
        println("Forecast: $displayMessage")
    }
}