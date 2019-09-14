package designpatterns.factorymethod.style.newyork

import designpatterns.factorymethod.Pizza
import designpatterns.factorymethod.PizzaStore
import designpatterns.factorymethod.style.newyork.pizza.NYStyleCheesePizza
import designpatterns.factorymethod.style.newyork.pizza.NYStyleClamPizza
import designpatterns.factorymethod.style.newyork.pizza.NYStylePeperoniPizza
import designpatterns.factorymethod.style.newyork.pizza.NYStyleVeggiPizza

class NYStylePizzaStore : PizzaStore() {
    override val name: String
        get() = "New York Style Pizza Store"

    override fun createPizza(type: String): Pizza {
        return when (type.toLowerCase()) {
            "cheese" -> NYStyleCheesePizza()
            "clam" -> NYStyleClamPizza()
            "pepperoni" -> NYStylePeperoniPizza()
            "veggi" -> NYStyleVeggiPizza()
            else -> throw IllegalArgumentException("We don't have pizza of $type")
        }
    }
}