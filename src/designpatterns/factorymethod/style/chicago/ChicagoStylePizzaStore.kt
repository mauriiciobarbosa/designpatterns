package designpatterns.factorymethod.style.chicago

import designpatterns.factorymethod.Pizza
import designpatterns.factorymethod.PizzaStore
import designpatterns.factorymethod.style.chicago.pizza.ChicagoStyleCheesePizza
import designpatterns.factorymethod.style.chicago.pizza.ChicagoStyleClamPizza
import designpatterns.factorymethod.style.chicago.pizza.ChicagoStylePeperoniPizza
import designpatterns.factorymethod.style.chicago.pizza.ChicagoStyleVeggiPizza

class ChicagoStylePizzaStore : PizzaStore() {
    override val name: String
        get() = "Chicago Style Pizza Store"

    override fun createPizza(type: String): Pizza {
        return when (type.toLowerCase()) {
            "cheese" -> ChicagoStyleCheesePizza()
            "clam" -> ChicagoStyleClamPizza()
            "pepperoni" -> ChicagoStylePeperoniPizza()
            "veggi" -> ChicagoStyleVeggiPizza()
            else -> throw IllegalArgumentException("We don't have pizza of $type")
        }
    }
}