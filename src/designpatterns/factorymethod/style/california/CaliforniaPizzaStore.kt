package designpatterns.factorymethod.style.california

import designpatterns.factorymethod.Pizza
import designpatterns.factorymethod.PizzaStore
import designpatterns.factorymethod.style.california.pizza.CaliforniaStyleCheesePizza
import designpatterns.factorymethod.style.california.pizza.CaliforniaStyleClamPizza
import designpatterns.factorymethod.style.california.pizza.CaliforniaStylePepperoniPizza
import designpatterns.factorymethod.style.california.pizza.CaliforniaStyleVeggiPizza

class CaliforniaPizzaStore : PizzaStore() {
    override val name: String
        get() = "California Style Pizza Store"

    override fun createPizza(type: String): Pizza {
        return when (type.toLowerCase()) {
            "cheese" -> CaliforniaStyleCheesePizza()
            "clam" -> CaliforniaStyleClamPizza()
            "pepperoni" -> CaliforniaStylePepperoniPizza()
            "veggi" -> CaliforniaStyleVeggiPizza()
            else -> throw IllegalArgumentException("We don't have pizza of $type")
        }
    }
}