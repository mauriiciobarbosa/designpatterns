package designpatterns.observer.subjects

import designpatterns.observer.observers.Observer

class WeatherData : Subject {
    private val observers = mutableListOf<Observer>()
    private var humidity = 0F
    private var temperature = 0F
    private var pressure = 0F

    override fun registerObserver(observer: Observer) {
        observers += observer
    }

    override fun removeObserver(observer: Observer) {
        observers -= observer
    }

    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.update(temperature, humidity, pressure)
        }
    }

    private fun measurementsChanged() = notifyObservers()

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}