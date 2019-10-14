package designpatterns.strategy.behaviors.fly

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("I can't fly")
    }
}