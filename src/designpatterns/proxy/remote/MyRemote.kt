package designpatterns.proxy.remote

import java.rmi.Remote
import java.rmi.RemoteException

interface MyRemote : Remote {
    @Throws(RemoteException::class)
    fun sayHello(): String
}