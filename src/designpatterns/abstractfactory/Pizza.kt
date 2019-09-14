package designpatterns.abstractfactory

import designpatterns.abstractfactory.ingredients.*

abstract class Pizza {
    lateinit var name: String

    protected lateinit var dough: Dough
    protected lateinit var sauce: Sauce
    protected lateinit var veggies: List<Veggies>
    protected lateinit var cheese: Cheese
    protected lateinit var pepperoni: Pepperoni
    protected lateinit var clams: Clams

    abstract fun prepare()

    open fun bake() = println("Bake for 25 minutes at 350")

    open fun cut() = println("Cutting the pizza into diagonal slices")

    open fun box() = println("Place pizza in official PizzaStore box")
}