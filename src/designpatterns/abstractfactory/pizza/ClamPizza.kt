package designpatterns.abstractfactory.pizza

import designpatterns.abstractfactory.Pizza
import designpatterns.abstractfactory.PizzaIngredientFactory

class ClamPizza(
    private val ingredientFactory: PizzaIngredientFactory
) : Pizza() {
    override fun prepare() {
        println("Preparing a $name")

        println("Adding ingredients...")
        cheese = ingredientFactory.createCheese()
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
    }
}