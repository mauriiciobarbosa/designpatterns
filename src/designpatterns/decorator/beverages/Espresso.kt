package designpatterns.decorator.beverages

import designpatterns.decorator.Beverage

class Espresso: Beverage() {
    override val description: String
        get() = "Espresso"
    override val cost: Double
        get() = 1.99
}