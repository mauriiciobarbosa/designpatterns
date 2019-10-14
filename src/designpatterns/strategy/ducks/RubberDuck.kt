package designpatterns.strategy.ducks

import designpatterns.strategy.behaviors.fly.FlyNoWay
import designpatterns.strategy.behaviors.quack.Squeak

class RubberDuck : Duck(flyBehavior = FlyNoWay(), quackBehavior = Squeak()) {
    override fun display() {
        println("I'm a rubber duck")
    }
}