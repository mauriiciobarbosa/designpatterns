package designpatterns.decorator.beverages

import designpatterns.decorator.Beverage

class DarkRoast : Beverage() {
    override val description: String
        get() = "Dark Roast Coffee"
    override val cost: Double
        get() = .95
}