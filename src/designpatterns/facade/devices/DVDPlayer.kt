package designpatterns.facade.devices

class DVDPlayer {
    private var movie: String = ""

    fun on() {
        println("$this on")
    }

    fun off() {
        println("$this off")
    }

    fun eject() {
        println("$this eject")
        movie = ""
    }

    fun play(movie: String) {
        this.movie = movie
        println("$this playing '$movie'")
    }

    fun pause() {
        println("$this pausing '$movie'")
    }

    fun stop() {
        println("$this stopped '$movie'")
    }

    fun setSurroundAudio() {
        println("$this setting surround audio")
    }

    fun setTwoChannelAudio() {
        println("$this setting two channel audio")
    }

    override fun toString(): String {
        return "Top-O-Line DVD Player"
    }

}