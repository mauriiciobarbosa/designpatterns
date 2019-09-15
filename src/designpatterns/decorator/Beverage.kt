package designpatterns.decorator

abstract class Beverage {
    abstract val description: String
    abstract val cost: Double

    override fun toString(): String = "$description - $${cost.format(2)}"

    private fun Double.format(digits: Int) = String.format("%.${digits}f", this)
}