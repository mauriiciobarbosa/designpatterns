package designpatterns.decorator.condiments

import designpatterns.decorator.Beverage
import designpatterns.decorator.CondimentDecorator

class Soy(
    private val beverage: Beverage
) : CondimentDecorator() {
    override val description: String get() = "${beverage.description}, Soy"
    override val cost: Double get() = beverage.cost + .10
}