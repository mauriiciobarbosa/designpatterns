package designpatterns.factorymethod

import designpatterns.factorymethod.style.chicago.ChicagoStylePizzaStore
import designpatterns.factorymethod.style.newyork.NYStylePizzaStore

fun main() {
    val nyStore = NYStylePizzaStore()
    val chicagoStore = ChicagoStylePizzaStore()

    orderPizza("Ethan", nyStore)
    orderPizza("Joel", chicagoStore)
}

fun orderPizza(client: String, store: PizzaStore) {
    val pizza = store.orderPizza("Cheese")
    println("$client ordered a ${pizza.name} from ${store.name} \n")
}