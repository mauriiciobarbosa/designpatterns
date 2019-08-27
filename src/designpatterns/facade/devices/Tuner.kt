package designpatterns.facade.devices

class Tuner {

    fun on() {
        println("tuner on")
    }

    fun off() {
        println("tuner off")
    }

    fun setAm() {
        println("setting am")
    }

    fun setFm() {
        println("setting fm")
    }

    fun setFrequency() {
        println("adjusting frquency")
    }

    override fun toString(): String {
        return "Tuner model 17670-974MVX"
    }

}