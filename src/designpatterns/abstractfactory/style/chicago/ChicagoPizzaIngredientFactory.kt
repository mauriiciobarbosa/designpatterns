package designpatterns.abstractfactory.style.chicago

import designpatterns.abstractfactory.PizzaIngredientFactory
import designpatterns.abstractfactory.ingredients.*
import designpatterns.abstractfactory.style.SlicedPepperoni

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough = ExtraThickCrustDough().apply {
        println("   $description")
    }

    override fun createSauce(): Sauce = PlumTomatoSauce().apply {
        println("   $description")
    }

    override fun createCheese(): Cheese = MozzarellaCheese().apply {
        println("   $description")
    }

    override fun createVeggies(): List<Veggies> {
        val veggies = listOf(Spinach(), BlackOlives(), EggPlant(), Parmesan(), Oregano())
        veggies.forEach { println("   $it.description") }
        return veggies
    }

    override fun createPepperoni(): Pepperoni = SlicedPepperoni().apply {
        println("   $description")
    }

    override fun createClam(): Clams = FrozenClam().apply {
        println("   $description")
    }
}