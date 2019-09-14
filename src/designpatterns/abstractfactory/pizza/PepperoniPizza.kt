package designpatterns.abstractfactory.pizza

import designpatterns.abstractfactory.Pizza
import designpatterns.abstractfactory.PizzaIngredientFactory

class PepperoniPizza(
    private val ingredientFactory: PizzaIngredientFactory
) : Pizza() {
    override fun prepare() {
        println("Preparing a $name")

        println("Adding ingredients...")
        cheese = ingredientFactory.createCheese()
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        clams = ingredientFactory.createClam()
        veggies = ingredientFactory.createVeggies()
        pepperoni = ingredientFactory.createPepperoni()
    }
}