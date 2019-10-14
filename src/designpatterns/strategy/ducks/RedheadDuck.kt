package designpatterns.strategy.ducks

import designpatterns.strategy.behaviors.fly.FlyWithWings
import designpatterns.strategy.behaviors.quack.Quack

class RedheadDuck : Duck(flyBehavior = FlyWithWings(), quackBehavior = Quack()) {
    override fun display() {
        println("I'm a real Red Headed duck")
    }
}