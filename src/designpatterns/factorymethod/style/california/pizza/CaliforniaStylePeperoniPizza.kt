package designpatterns.factorymethod.style.california.pizza

import designpatterns.factorymethod.Pizza

class CaliforniaStylePeperoniPizza : Pizza() {
    override val name: String
        get() = "California Style Peperoni Pizza"
    override val dough: String
        get() = "Thin Crust Dough"
    override val sauce: String
        get() = "California sauce"
    override val toppings: List<String>
        get() = listOf("Grated California Cheese")
}