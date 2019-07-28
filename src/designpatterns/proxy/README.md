Proxy Pattern
======================

This package is a sample about the `Proxy` Pattern. The main goal is serve as a explanation about how proxy pattern works.

## Overview

Proxy is a pattern used when you need to control and manage access to another objects. 

There are several ways in which proxies stand in for the objects they proxy, and the variations typically revolve the way
the proxy "control access". The most known type of proxies are: Remote proxy, Virtual Proxy and Protection Proxy.

### Remote Proxy

A Remote Proxy controls access to a remote object. It acts as a local representative to a remote object (skeleton). 
What's a "remote object"? It's an object that lives in the heap of a different Java Virtual Machine (or more generally, a 
remote object that is running in a different address space). What's a "local representative"? It's an object that you can 
call local methods on and have them forwarded on to the remote object.

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Proxy_pattern_diagram.svg/439px-Proxy_pattern_diagram.svg.png">

In my example, I used the Java RMI library, which generates a local representative (stub) that forwards all requests to 
a remote object (skeleton) previously registered on the RMI.

### Virtual Proxy

### Protection Proxy

## Real world examples
