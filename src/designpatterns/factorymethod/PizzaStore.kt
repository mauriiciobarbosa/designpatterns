package designpatterns.factorymethod

abstract class PizzaStore {

    abstract val name: String

    fun orderPizza(type: String): Pizza {
        return createPizza(type).apply {
            prepare()
            bake()
            cut()
            box()
        }
    }

    abstract fun createPizza(type: String): Pizza

}