package designpatterns.factorymethod.style.chicago.pizza

import designpatterns.factorymethod.Pizza

class ChicagoStyleClamPizza : Pizza() {
    override val name: String
        get() = "Chicago Style Deep Dish Clam Pizza"
    override val dough: String
        get() = "Extra Thin Crust Dough"
    override val sauce: String
        get() = "Plum Tomato sauce"
    override val toppings: List<String>
        get() = listOf("Shredded Mozzarella Cheese", "Parmesan", "Clams")

    override fun cut() {
        println("Cutting the Pizza into square slices")
    }

}