package designpatterns.abstractfactory.style.chicago

import designpatterns.abstractfactory.ingredients.*

class ExtraThickCrustDough : Dough() {
    override val description: String
        get() = "Extra Thin Crust Dough"
}

class PlumTomatoSauce : Sauce() {
    override val description: String
        get() = "Plum Tomato sauce"
}

class MozzarellaCheese : Cheese() {
    override val description: String
        get() = "Shredded Mozzarella Cheese"
}

class Spinach : Veggies()
class BlackOlives : Veggies()
class EggPlant : Veggies()
class Parmesan : Veggies()
class Oregano : Veggies()

class FrozenClam : Clams() {
    override val description: String
        get() = "Frozen Clams"
}