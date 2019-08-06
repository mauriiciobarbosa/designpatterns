package designpatterns.composite.math

sealed class Operator : Expression {
    class Sum(private val a: Expression, private val b: Expression) : Operator() {
        override fun eval(): Double = a.eval() + b.eval()
    }

    class Minus(val a: Expression, val b: Expression) : Operator() {
        override fun eval(): Double = a.eval() - b.eval()
    }

    class Div(private val a: Expression, private val b: Expression) : Operator() {
        override fun eval(): Double = a.eval() / b.eval()
    }

    class Multiply(private val a: Expression, private val b: Expression) : Operator() {
        override fun eval(): Double = a.eval() * b.eval()
    }

    class Pow(private val base: Expression, private val exponent: Expression) : Operator() {
        override fun eval(): Double = Math.pow(base.eval(), exponent.eval())
    }
}