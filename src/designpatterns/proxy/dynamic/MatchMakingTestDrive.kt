package designpatterns.proxy.dynamic

fun main() {
    val owner = PersonFactory.createPerson(name = "Joe Javabean", gender = "Male", isOwner = true)

    println("Name is ${owner.name}")

    owner.interests = "bowling, Go"

    try {
        owner.hotOrNotHotRating = 10
    } catch (e: Exception) {
        println(e.message)
    }

    println("Rating is ${owner.hotOrNotHotRating}")

    val nonOwner = PersonFactory.createPerson("Kelly Jhonson", gender = "Female")

    println("Name is ${nonOwner.name}")

    try {
        nonOwner.interests = "bowling, Go"
    } catch (e: Exception) {
        println(e.message)
    }

    nonOwner.hotOrNotHotRating = 3
    println("Rating set from non owner proxy")
    println("Rating is ${nonOwner.hotOrNotHotRating}")
}