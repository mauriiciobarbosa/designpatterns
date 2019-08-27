package designpatterns.facade

import designpatterns.facade.devices.*

class HomeTheaterFacade(
    val amp: Amplifier = Amplifier(),
    val dvd: DVDPlayer = DVDPlayer(),
    val projector: Projector = Projector(),
    val lights: TheaterLights = TheaterLights(),
    val screen: Screen = Screen(),
    val popper: PopcornPopper = PopcornPopper()
) {

    fun watchMovie(movie: String) {
        println("Get ready to watch a movie...")
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.setDvd(dvd)
        amp.setSurroundSound()
        amp.setVolume(5)
        dvd.on()
        dvd.play(movie)
    }

    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        dvd.stop()
        dvd.eject()
        dvd.off()
    }
}