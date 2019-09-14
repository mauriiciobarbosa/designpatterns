package designpatterns.abstractfactory.style.newyork

import designpatterns.abstractfactory.ingredients.*

class ThinCrustDough : Dough() {
    override val description: String
        get() = "Thin Crust Dough"
}

class MarinaSauce : Sauce() {
    override val description: String
        get() = "Marinara sauce"
}

class ReggianoCheese : Cheese() {
    override val description: String
        get() = "Grated Reggiano Cheese"
}

class Garlic : Veggies()
class Onion : Veggies()
class MushRoom : Veggies()
class RedPepper : Veggies()

class FreshClam : Clams() {
    override val description: String
        get() = "Fresh Clams"
}