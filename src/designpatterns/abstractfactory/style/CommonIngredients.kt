package designpatterns.abstractfactory.style

import designpatterns.abstractfactory.ingredients.Pepperoni

class SlicedPepperoni : Pepperoni() {
    override val description: String
        get() = "Sliced Pepperoni"
}