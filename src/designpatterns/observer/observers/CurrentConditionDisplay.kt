package designpatterns.observer.observers

import designpatterns.observer.subjects.WeatherData

class CurrentConditionDisplay(
    weatherData: WeatherData
) : Observer, DisplayElement {

    private var humidity = 0F
    private var temp = 0F

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temp = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: ${temp}F degrees and ${humidity}% humidity")
    }
}