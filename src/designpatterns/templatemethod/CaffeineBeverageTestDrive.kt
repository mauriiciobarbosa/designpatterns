package designpatterns.templatemethod

import designpatterns.templatemethod.beverage.BlackCoffee
import designpatterns.templatemethod.beverage.CaffeineBeverage
import designpatterns.templatemethod.beverage.Coffee
import designpatterns.templatemethod.beverage.Tea

fun main() {
    val coffee = Coffee()
    val blackCoffee = BlackCoffee()
    val tea = Tea()

    prepare(coffee)
    prepare(blackCoffee)
    prepare(tea)
}

fun prepare(beverage: CaffeineBeverage) {
    println("Preparing a ${beverage.javaClass.simpleName}")
    beverage.prepareRecipe()
    println("Delivering a hot ${beverage.javaClass.simpleName}")
}
