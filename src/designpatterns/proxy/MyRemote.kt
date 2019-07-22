package designpatterns.proxy

import java.rmi.Remote
import java.rmi.RemoteException

interface MyRemote : Remote {
    @Throws(RemoteException::class)
    fun sayHello(): String
}