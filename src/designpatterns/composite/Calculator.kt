package designpatterns.composite

import designpatterns.composite.math.Expression
import designpatterns.composite.math.Num
import designpatterns.composite.math.Operator.*

fun main() {
    calculate(Pow(Sum(Multiply(Num(2.0), Num(2.0)), Num(5.0)), Num(3.0)))
    calculate(ExpressionHandler.createExpression("(2 * 2 + 5) ^ 3"))
}

fun calculate(exp: Expression) {
    println(exp.eval())
}