package designpatterns.factorymethod.style.chicago.pizza

import designpatterns.factorymethod.Pizza

class ChicagoStyleVeggiPizza : Pizza() {
    override val name: String
        get() = "Chicago Style Veggi Pizza"
    override val dough: String
        get() = "Extra Thin Crust Dough"
    override val sauce: String
        get() = "Plum Tomato sauce"
    override val toppings: List<String>
        get() = listOf("Mozzarella", "Parmesan", "Eggplant", "Spinach", "Black Olives")

    override fun cut() {
        println("Cutting the Pizza into square slices")
    }

}