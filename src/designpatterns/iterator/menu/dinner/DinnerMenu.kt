package designpatterns.iterator.menu.dinner

import designpatterns.iterator.menu.Menu
import designpatterns.iterator.menu.MenuItem

class DinnerMenu : Menu {

    companion object {
        const val MAX_ITEMS = 6
    }

    private val menuItems = Array(MAX_ITEMS) {
        MenuItem(
            "",
            "",
            false,
            0.0
        )
    }
    private var numberOfItems = 0

    init {
        addItem("Vegetarian BLT", "(Fakin') bacon with lettuce & tomato on whole wheat", true, 2.99)
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99)
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29)
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05)
    }

    override fun addItem(name: String, description: String, isVegetarian: Boolean, price: Double) {
        val newItem = MenuItem(name, description, isVegetarian, price)

        if (numberOfItems >= MAX_ITEMS) {
            println("Sorry, menu is full! Can't add item to menu")
        } else {
            menuItems[numberOfItems++] = newItem
        }
    }

    override val title: String
        get() = "Lunch"
    override val items: Iterator<MenuItem>
        get() = DinnerMenuIterator(menuItems) { numberOfItems }
}