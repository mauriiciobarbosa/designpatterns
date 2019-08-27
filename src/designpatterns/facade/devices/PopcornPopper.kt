package designpatterns.facade.devices

class PopcornPopper {
    fun on() {
        println("Popcorn popper on")
    }

    fun off() {
        println("Popcorn popper off")
    }

    fun pop() {
        println("Popcorn popper popping popcorn!")
    }

    override fun toString(): String {
        return "Popcorn Popper Mondial PP-02"
    }
}