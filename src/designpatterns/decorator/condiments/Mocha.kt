package designpatterns.decorator.condiments

import designpatterns.decorator.Beverage
import designpatterns.decorator.CondimentDecorator

class Mocha(
    private val beverage: Beverage
) : CondimentDecorator() {
    override val description: String get() = "${beverage.description}, Mocha"
    override val cost: Double get() = beverage.cost + .20
}