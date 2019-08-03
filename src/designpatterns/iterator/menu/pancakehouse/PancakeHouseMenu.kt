package designpatterns.iterator.menu.pancakehouse

import designpatterns.iterator.menu.Menu
import designpatterns.iterator.menu.MenuItem

class PancakeHouseMenu : Menu {
    private val menuItems = ArrayList<MenuItem>()

    init {
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs", true, 2.99)
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99)
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49)
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59)
    }

    override fun addItem(name: String, description: String, isVegetarian: Boolean, price: Double) {
        menuItems.add(MenuItem(name, description, isVegetarian, price))
    }

    override val title: String
        get() = "Breakfast"

    override val items: Iterator<MenuItem>
        get() = menuItems.iterator()
}