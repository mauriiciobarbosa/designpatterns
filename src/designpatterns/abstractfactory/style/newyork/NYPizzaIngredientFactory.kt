package designpatterns.abstractfactory.style.newyork

import designpatterns.abstractfactory.*
import designpatterns.abstractfactory.ingredients.*
import designpatterns.abstractfactory.style.SlicedPepperoni

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough = ThinCrustDough().apply {
        println("   $description")
    }

    override fun createSauce(): Sauce = MarinaSauce().apply {
        println("   $description")
    }

    override fun createCheese(): Cheese = ReggianoCheese().apply {
        println("   $description")
    }

    override fun createVeggies(): List<Veggies> {
        val veggies = listOf(Garlic(), Onion(), MushRoom(), RedPepper())
        veggies.forEach { println("   $it.description") }
        return veggies
    }

    override fun createPepperoni(): Pepperoni = SlicedPepperoni().apply {
        println("   $description")
    }

    override fun createClam(): Clams = FreshClam().apply {
        println("   $description")
    }
}