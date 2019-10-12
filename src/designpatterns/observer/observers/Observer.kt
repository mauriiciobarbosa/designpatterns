package designpatterns.observer.observers

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}