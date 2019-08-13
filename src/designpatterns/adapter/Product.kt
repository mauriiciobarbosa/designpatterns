package designpatterns.adapter

data class Product(
    val description: String,
    val price: Double
) {
    fun print() {
        println("$description, U$ $price")
    }
}