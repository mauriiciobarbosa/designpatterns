package designpatterns.facade.devices

class CDPlayer {

    fun on() {
        println("cd player on")
    }

    fun off() {
        println("cd player off")
    }

    fun eject() {
        println("ejecting cd")
    }

    fun play() {
        println("playing cd")
    }

    fun pause() {
        println("pausing cd")
    }

    fun stop() {
        println("stopping cd")
    }

    override fun toString(): String {
        return "CD Player model 17678-834UMGV"
    }

}