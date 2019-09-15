package designpatterns.decorator

import designpatterns.decorator.beverages.DarkRoast
import designpatterns.decorator.beverages.Espresso
import designpatterns.decorator.beverages.HouseBlend
import designpatterns.decorator.condiments.Mocha
import designpatterns.decorator.condiments.Soy
import designpatterns.decorator.condiments.Whip

fun main() {
    val espresso = Espresso()

    println(espresso)

    val darkRoastWithDoubleMochaAndWhip = addWhip(addMocha(addMocha(DarkRoast())))

    println(darkRoastWithDoubleMochaAndWhip)

    val houseBlendWithCondiments = addWhip(addMocha(addSoy(HouseBlend())))

    println(houseBlendWithCondiments)
}

fun addMocha(beverage: Beverage) = Mocha(beverage)
fun addSoy(beverage: Beverage) = Soy(beverage)
fun addWhip(beverage: Beverage) = Whip(beverage)