package designpatterns.iterator.menu.cafe

import designpatterns.iterator.menu.Menu
import designpatterns.iterator.menu.MenuItem

class CafeMenu : Menu {
    private val menuItems = mutableMapOf<String, MenuItem>()

    init {
        addItem(
            "Veggie Burger and Air Fries",
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true,
            3.99
        )
        addItem(
            "Soup of the day",
            "A cup of the soup of the day, with a side salad",
            false,
            3.69
        )
        addItem(
            "Burrito",
            "A large burrito, with whole pinto beans, salsa, guacamole",
            true,
            4.29
        )
    }

    override val title: String
        get() = "Coffee"

    override val items: Iterator<MenuItem>
        get() = menuItems.values.iterator()

    override fun addItem(name: String, description: String, isVegetarian: Boolean, price: Double) {
        val menu = MenuItem(name, description, isVegetarian, price)
        menuItems[menu.name] = menu
    }
}