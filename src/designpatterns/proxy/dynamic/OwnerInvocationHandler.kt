package designpatterns.proxy.dynamic

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class OwnerInvocationHandler(
    private val person: PersonBean
) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<Any>?): Any {
        return when {
            method!!.name.startsWith("get") -> method.invoke(person)
            method.name == "setHorOrNotHotRating" -> throw IllegalAccessException("You can't set rating for yourself")
            else -> method.invoke(person, *args!!)
        } ?: Unit
    }
}