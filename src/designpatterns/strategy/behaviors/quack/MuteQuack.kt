package designpatterns.strategy.behaviors.quack

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}