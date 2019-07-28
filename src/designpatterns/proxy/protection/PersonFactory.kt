package designpatterns.proxy.protection

import java.lang.reflect.Proxy

object PersonFactory {

    fun createPerson(name: String, gender: String, interests: String = "", isOwner: Boolean = false): PersonBean {
        val person = Person(name, gender).apply {
            this.interests = interests
        }

        val invocationHandler = if (isOwner) {
            OwnerInvocationHandler(person)
        } else {
            NonOwnerInvocationHandler(person)
        }

        return Proxy.newProxyInstance(
            person::class.java.classLoader,
            person::class.java.interfaces,
            invocationHandler
        ) as PersonBean
    }
}