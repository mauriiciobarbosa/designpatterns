package designpatterns.facade.devices

class Projector {
    fun on() {
        println("$this on")
    }

    fun off() {
        println("$this off")
    }

    fun tvMode() {
        println("$this in tv mode")
    }

    fun wideScreenMode() {
        println("$this in widescreen mode (16x9 aspect ratio)")
    }

    override fun toString(): String {
        return "Top-O-Line Projector"
    }
}