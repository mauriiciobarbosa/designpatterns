package designpatterns.adapter

import java.util.*

class Catalog(
    private val items: Enumeration<Product>
) {

    fun show() {
        for (item in items) item.print()
    }
}