package designpatterns.abstractfactory

import designpatterns.abstractfactory.ingredients.*

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}