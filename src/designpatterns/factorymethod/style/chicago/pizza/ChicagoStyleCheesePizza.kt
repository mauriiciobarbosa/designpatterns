package designpatterns.factorymethod.style.chicago.pizza

import designpatterns.factorymethod.Pizza

class ChicagoStyleCheesePizza : Pizza() {
    override val name: String
        get() = "Chicago Style Deep Dish Cheese Pizza"
    override val dough: String
        get() = "Extra Thin Crust Dough"
    override val sauce: String
        get() = "Plum Tomato sauce"
    override val toppings: List<String>
        get() = listOf("Shredded Mozzarella Cheese")

    override fun cut() {
        println("Cutting the Pizza into square slices")
    }

}