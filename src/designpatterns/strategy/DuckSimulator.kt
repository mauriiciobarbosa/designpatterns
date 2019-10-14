package designpatterns.strategy

import designpatterns.strategy.ducks.*

fun main() {
    val ducks = createDucks()

    ducks.forEach { duck ->
        duck.display()
        duck.swim()
        duck.fly()
        duck.quack()
    }
}

fun createDucks(): List<Duck> = listOf(
    MallardDuck(),
    RedheadDuck(),
    RubberDuck(),
    DecoyDuck()
)