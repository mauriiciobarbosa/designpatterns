package designpatterns.proxy.dynamic

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
            PersonBean::class.java.classLoader,
            arrayOf(PersonBean::class.java),
            invocationHandler
        ) as PersonBean
    }
}