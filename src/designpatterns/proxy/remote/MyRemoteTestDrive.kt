package designpatterns.proxy.remote

import java.rmi.Naming

/**
 * To run this example, you must first bring up the RMI Registry service. After that, just execute the main
 * method located on MyRemoteImpl.kt file to register the representative object (skeleton) on the registry service. Finally,
 * run this method to retrieve the local representative object (stub) and make use of it.
 *
 * Obs.: Make sure the RMI Registry is able to load the MyRemote class. In order to do that, just add the MyRemote.class
 * in the CLASSPATH environment variable.
 */
fun main() {
    val service = Naming.lookup("rmi://127.0.0.1/RemoteHello") as MyRemote

    val hello = service.sayHello()

    println(hello)
}
