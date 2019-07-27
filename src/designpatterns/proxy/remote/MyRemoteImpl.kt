package designpatterns.proxy.remote

import java.rmi.Naming
import java.rmi.server.UnicastRemoteObject

class MyRemoteImpl : UnicastRemoteObject(), MyRemote {

    companion object {
        const val serialVersionUID: Long = 1L
    }

    override fun sayHello(): String {
        return "Server says, 'Hey'"
    }
}

fun main() {
    try {
        println("starting")
        val service: MyRemote = MyRemoteImpl()
        println("instanciated service")
        Naming.rebind("RemoteHello", service)
        println("Service started")
    } catch (e: Exception) {
        println("Error on init service")
        e.printStackTrace()
    }
}