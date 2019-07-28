package designpatterns.proxy.protection

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class NonOwnerInvocationHandler(
    private val person: PersonBean
) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        return when {
            method!!.name.startsWith("get") -> method.invoke(person)
            method.name == "setHotOrNotHotRating" ->method.invoke(person, *args!!)
            else -> throw IllegalAccessException("You can't change personal information of someone else")
        } ?: Unit
    }
}