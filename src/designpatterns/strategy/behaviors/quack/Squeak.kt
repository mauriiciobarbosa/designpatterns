package designpatterns.strategy.behaviors.quack

class Squeak : QuackBehavior {
    override fun quack() {
        println("Squeak")
    }
}