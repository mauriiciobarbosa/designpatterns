package designpatterns.commandpattern

import designpatterns.commandpattern.menu.MenuActions

fun main() {
    val allMenus = MenuActions.getActions()

    for (menu in allMenus) {
        with(menu) {
            println("clicking on menu $title")
            action()
        }
    }
}