package designpatterns.templatemethod.beverage

class BlackCoffee : CaffeineBeverage() {
    override val beverageHasCondiments: Boolean = false

    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        // do nothing
    }
}