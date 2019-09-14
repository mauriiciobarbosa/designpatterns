package designpatterns.abstractfactory

import designpatterns.abstractfactory.style.chicago.ChicagoStylePizzaStore
import designpatterns.abstractfactory.style.newyork.NYStylePizzaStore


fun main() {
    val nyStore = NYStylePizzaStore()
    val chicagoStore = ChicagoStylePizzaStore()

    orderPizza("Ethan", nyStore)
    orderPizza("Joel", chicagoStore)
}

fun orderPizza(client: String, store: PizzaStore): Pizza {
    println()
    println("$client ordered a cheese pizza at ${store.name}")
    return store.orderPizza("Cheese")
}