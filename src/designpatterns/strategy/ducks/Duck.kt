package designpatterns.strategy.ducks

import designpatterns.strategy.behaviors.fly.FlyBehavior
import designpatterns.strategy.behaviors.quack.QuackBehavior

abstract class Duck(
    private val flyBehavior: FlyBehavior,
    private val quackBehavior: QuackBehavior
) : FlyBehavior by flyBehavior, QuackBehavior by quackBehavior {

    fun swim() {
        println("All ducks float, even decoys!")
    }

    abstract fun display()
}