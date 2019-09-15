package designpatterns.decorator.condiments

import designpatterns.decorator.Beverage
import designpatterns.decorator.CondimentDecorator

class Whip(
    private val beverage: Beverage
) : CondimentDecorator() {
    override val description: String get() = "${beverage.description}, Whip"
    override val cost: Double get() = beverage.cost + .15
}