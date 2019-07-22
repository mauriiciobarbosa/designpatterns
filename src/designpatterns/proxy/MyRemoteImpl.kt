package designpatterns.proxy

import java.rmi.server.UnicastRemoteObject

class MyRemoteImpl : UnicastRemoteObject(), MyRemote {

    companion object {
        const val serialVersionUID: Long = 1L
    }

    override fun sayHello(): String {
        return "Server says, 'Hey'"
    }
}