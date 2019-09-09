package designpatterns.factorymethod

import designpatterns.factorymethod.pizza.Pizza
import designpatterns.factorymethod.pizza.SimplePizzaFactory

class PizzaStore(
    private val pizzaFactory: SimplePizzaFactory
) {

    fun orderPizza(type: String): Pizza {
        return pizzaFactory.createPizza(type).apply {
            prepapre()
            bake()
            cut()
            box()
        }
    }

}