package designpatterns.templatemethod.beverage

abstract class CaffeineBeverage {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (beverageHasCondiments) addCondiments()
    }

    private fun boilWater() {
        println("Boiling water")
    }

    private fun pourInCup() {
        println("Pouring into cup")
    }

    protected abstract fun brew()

    protected abstract fun addCondiments()

    protected open val beverageHasCondiments: Boolean = true
}