package designpatterns.iterator.menu

interface Menu {
    val title: String
    val items: Iterator<MenuItem>
    fun addItem(name: String, description: String, isVegetarian: Boolean, price: Double)
}