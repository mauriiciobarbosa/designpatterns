package designpatterns.strategy.ducks

import designpatterns.strategy.behaviors.fly.FlyWithWings
import designpatterns.strategy.behaviors.quack.Quack

class MallardDuck : Duck(flyBehavior = FlyWithWings(), quackBehavior = Quack()) {
    override fun display() {
        println("I'm a real Mallard duck")
    }
}