package designpatterns.abstractfactory.ingredients

abstract class Cheese {
    abstract val description: String
}

abstract class Clams {
    abstract val description: String
}

abstract class Dough {
    abstract val description: String
}

abstract class Pepperoni {
    abstract val description: String
}

abstract class Sauce {
    abstract val description: String
}

abstract class Veggies {
    val description: String get() = this.javaClass.simpleName
}