package designpatterns.adapter

fun main() {
    val items = listOf(
        Product("T-Shirt", 20.0),
        Product("Short", 25.0),
        Product("Socks", 4.50)
    )

    val adapter = EnumerationAdapter(items.iterator())
    val catalog = Catalog(adapter)

    catalog.show()
}