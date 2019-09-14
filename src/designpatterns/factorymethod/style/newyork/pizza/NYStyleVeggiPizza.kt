package designpatterns.factorymethod.style.newyork.pizza

import designpatterns.factorymethod.Pizza

class NYStyleVeggiPizza : Pizza() {
    override val name: String
        get() = "NY Style Veggi Pizza"
    override val dough: String
        get() = "Thin Crust Dough"
    override val sauce: String
        get() = "Marinara sauce"
    override val toppings: List<String>
        get() = listOf("Grated Reggiano Cheese", "Mushrooms", "Onions", "Red peppers")
}