package designpatterns.factorymethod.style.chicago.pizza

import designpatterns.factorymethod.Pizza

class ChicagoStylePepperoniPizza : Pizza() {
    override val name: String
        get() = "Chicago Style Deep Dish Pepperoni Pizza"
    override val dough: String
        get() = "Extra Thin Crust Dough"
    override val sauce: String
        get() = "Plum Tomato sauce"
    override val toppings: List<String>
        get() = listOf("Mozzarella", "Parmesan", "Eggplant", "Spinach", "Black Olives", "Pepperoni")

    override fun cut() {
        println("Cutting the Pizza into square slices")
    }

}