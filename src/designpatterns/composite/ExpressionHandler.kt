package designpatterns.composite

import designpatterns.composite.math.Expression
import designpatterns.composite.math.Num
import designpatterns.composite.math.Operator.*

object ExpressionHandler {
    fun createExpression(exp: String): Expression {
        if (isValidExpression(exp).not()) throw IllegalArgumentException("'$exp' isn't a valid expression")
        return when {
            '(' in exp && ')' in exp -> {
                val expression = exp.substring(exp.indexOf('(') + 1, exp.indexOf(')'))
                val result = createExpression(expression).eval().toString()
                createExpression(exp.replace("($expression)", result))
            }
            '+' in exp -> Sum(
                createExpression(exp.substringBefore('+')),
                createExpression(exp.substringAfter('+'))
            )
            '-' in exp -> Minus(
                createExpression(exp.substringBefore('-')),
                createExpression(exp.substringAfter('-'))
            )
            '/' in exp -> Div(
                createExpression(exp.substringBefore('/')),
                createExpression(exp.substringAfter('/'))
            )
            '*' in exp -> Multiply(
                createExpression(exp.substringBefore('*')),
                createExpression(exp.substringAfter('*'))
            )
            '^' in exp -> Pow(
                createExpression(exp.substringBefore('^')),
                createExpression(exp.substringAfter('^'))
            )
            else -> Num(exp.toDouble())
        }
    }

    private fun isValidExpression(exp: String): Boolean {
        return exp.count { it == '(' } == exp.count { it == ')' } && exp.count { it.isDigit() } > exp.count {
            it in setOf('+', '-', '/', '*', '^')
        }
    }
}