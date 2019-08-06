package designpatterns.composite.math

class Num(private val value: Double) : Expression {
    override fun eval() = value
}