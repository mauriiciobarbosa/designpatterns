package designpatterns.strategy.behaviors.quack

class Quack : QuackBehavior {
    override fun quack() {
        println("Quack")
    }
}