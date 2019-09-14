package designpatterns.factorymethod.style.california.pizza

import designpatterns.factorymethod.Pizza

class CaliforniaStyleClamPizza : Pizza() {
    override val name: String
        get() = "California Style Clam Pizza"
    override val dough: String
        get() = "Thin Crust Dough"
    override val sauce: String
        get() = "California sauce"
    override val toppings: List<String>
        get() = emptyList()
}