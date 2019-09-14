package designpatterns.factorymethod.style.california.pizza

import designpatterns.factorymethod.Pizza

class CaliforniaStylePepperoniPizza : Pizza() {
    override val name: String
        get() = "California Style Pepperoni Pizza"
    override val dough: String
        get() = "Thin Crust Dough"
    override val sauce: String
        get() = "California sauce"
    override val toppings: List<String>
        get() = listOf("Grated California Cheese")
}