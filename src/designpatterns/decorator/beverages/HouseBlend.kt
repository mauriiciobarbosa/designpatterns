package designpatterns.decorator.beverages

import designpatterns.decorator.Beverage

class HouseBlend : Beverage() {
    override val description: String
        get() = "House Blend Coffee"
    override val cost: Double
        get() = .89
}