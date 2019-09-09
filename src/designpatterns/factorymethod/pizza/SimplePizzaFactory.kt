package designpatterns.factorymethod.pizza

class SimplePizzaFactory {

    fun createPizza(type: String): Pizza = when (type.toLowerCase()) {
        "cheese" -> CheesePizza()
        "greek" -> GreekPizza()
        "pepperoni" -> PepperoniPizza()
        else -> throw IllegalArgumentException("We don't have pizza of $type")
    }

}