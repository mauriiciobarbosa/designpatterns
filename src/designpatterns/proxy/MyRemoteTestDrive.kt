package designpatterns.proxy

import java.rmi.Naming

fun main() {
    val service = Naming.lookup("rmi://127.0.0.1/RemoteHello") as MyRemote

    val hello = service.sayHello()

    println(hello)
}
