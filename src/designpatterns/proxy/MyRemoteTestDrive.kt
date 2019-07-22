package designpatterns.proxy

import java.rmi.Naming

fun main() {
    startRemote()

    val service = Naming.lookup("rmi://127.0.0.1/RemoteHello") as MyRemote

    service.sayHello()
}

fun startRemote() {
    val service: MyRemote = MyRemoteImpl()
    Naming.rebind("RemoteHello", service)
}
