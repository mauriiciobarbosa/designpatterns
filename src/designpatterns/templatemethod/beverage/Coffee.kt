package designpatterns.templatemethod.beverage

class Coffee : CaffeineBeverage() {
    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding sugar and milk")
    }
}