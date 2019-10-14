package designpatterns.strategy.ducks

import designpatterns.strategy.behaviors.fly.FlyNoWay
import designpatterns.strategy.behaviors.quack.MuteQuack

class DecoyDuck : Duck(flyBehavior = FlyNoWay(), quackBehavior = MuteQuack()) {
    override fun display() {
        println("I'm a duck Decoy")
    }
}