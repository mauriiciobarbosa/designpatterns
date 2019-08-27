package designpatterns.facade.devices

class TheaterLights {
    fun on() {
        println("$this lights on")
    }

    fun off() {
        println("$this lights off")
    }

    fun dim(percent: Int) {
        println("$this lights dimming to $percent%")
    }

    override fun toString(): String {
        return "Theater ceiling"
    }
}