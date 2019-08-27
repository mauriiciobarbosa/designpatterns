package designpatterns.facade

fun main() {
    val homeTheater = HomeTheaterFacade()

    homeTheater.watchMovie("Fast and Furious")
    homeTheater.endMovie()
}