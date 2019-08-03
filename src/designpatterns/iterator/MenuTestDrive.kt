package designpatterns.iterator

import designpatterns.iterator.menu.cafe.CafeMenu
import designpatterns.iterator.menu.dinner.DinnerMenu
import designpatterns.iterator.menu.pancakehouse.PancakeHouseMenu

fun main() {
    val pancakeHouseMenu = PancakeHouseMenu()
    val dinnerMenu = DinnerMenu()
    val cafeMenu = CafeMenu()

    val waitress = Waitress(pancakeHouseMenu, dinnerMenu, cafeMenu)

    waitress.printMenu()
}