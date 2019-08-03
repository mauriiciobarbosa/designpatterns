package designpatterns.iterator

import designpatterns.iterator.menu.Menu
import designpatterns.iterator.menu.MenuItem

class Waitress(
    private vararg val menus: Menu
) {

    fun printMenu() {
        println("MENUS")
        for (menu in menus) {
            println()
            println("---------------")
            println(menu.title)
            println("---------------")
            printMenu(menu.items)
        }
    }

    private fun printMenu(items: Iterator<MenuItem>) {
        for (item in items) with(item) { println("$name, $price -- $description") }
    }
}