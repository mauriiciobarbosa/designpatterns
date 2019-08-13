package designpatterns.adapter

import java.util.*

class EnumerationAdapter<T>(
    private val adaptee: Iterator<T>
) : Enumeration<T> {
    override fun hasMoreElements(): Boolean = adaptee.hasNext()

    override fun nextElement(): T = adaptee.next()
}