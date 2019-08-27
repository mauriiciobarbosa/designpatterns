package designpatterns.facade.devices

class Amplifier {

    private var tuner: Tuner? = null
    private var cdPlayer: CDPlayer? = null
    private var dvdPlayer: DVDPlayer? = null

    fun on() {
        println("$this on")
    }

    fun off() {
        println("$this off")
    }

    fun setCd(cdPlayer: CDPlayer) {
        println("$this setting cd player to $cdPlayer")
        this.cdPlayer = cdPlayer
    }

    fun setDvd(dvdPlayer: DVDPlayer) {
        println("$this setting dvd player to $dvdPlayer")
        this.dvdPlayer = dvdPlayer
    }

    fun setStereoSound() {
        dvdPlayer?.setTwoChannelAudio()
    }

    fun setSurroundSound() {
        println("$this surround sound on (5 speakers, 1 subwoofer)")
    }

    fun setVolume(value: Int) {
        println("$this setting volume to $value")
    }

    override fun toString(): String {
        return "Top-O-Line Amplifier"
    }
}