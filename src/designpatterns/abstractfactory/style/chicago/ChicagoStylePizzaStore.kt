package designpatterns.abstractfactory.style.chicago

import designpatterns.abstractfactory.Pizza
import designpatterns.abstractfactory.PizzaStore
import designpatterns.abstractfactory.pizza.CheesePizza
import designpatterns.abstractfactory.pizza.ClamPizza
import designpatterns.abstractfactory.pizza.PepperoniPizza
import designpatterns.abstractfactory.pizza.VeggiPizza

class ChicagoStylePizzaStore : PizzaStore() {
    override val name: String
        get() = "Chicago Style Pizza Store"

    override fun createPizza(type: String): Pizza {
        val ingredientFactory = ChicagoPizzaIngredientFactory()
        val pizzaName = "Chicago Style ${type.capitalize()} Pizza"

        return when (type.toLowerCase()) {
            "cheese" -> CheesePizza(ingredientFactory).apply { name = pizzaName }
            "clam" -> ClamPizza(ingredientFactory).apply { name = pizzaName }
            "pepperoni" -> PepperoniPizza(ingredientFactory).apply { name = pizzaName }
            "veggi" -> VeggiPizza(ingredientFactory).apply { name = pizzaName }
            else -> throw IllegalArgumentException("We don't have pizza of $type")
        }
    }
}