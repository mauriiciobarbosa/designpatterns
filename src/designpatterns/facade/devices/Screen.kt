package designpatterns.facade.devices

class Screen {
    fun up() {
        println("$this going up")
    }

    fun down() {
        println("$this going down")
    }

    override fun toString(): String {
        return "Theater Screen"
    }
}