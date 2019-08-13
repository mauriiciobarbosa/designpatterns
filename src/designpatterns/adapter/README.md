Adapter Pattern
======================

The `Adapter Pattern` converts the interface of a class into another interface the client expects. Adapter lets classes 
work together that couldn't otherwise because of incompatible interfaces.

This acts to decouple the client from the implemented interface, and if we expect the interface to change over time, 
the adapter encapsulates that change so that the client doesn't have to be modified each time it needs to operate against
a different interface.

There are actually two kinds of adapters: `Object Adapters` and `Class Adapters`. The only difference is that with
`Class Adapter` we subclass the Target and the Adaptee, while with `Object Adapter` we use composition to pass requests
to an Adaptee.

<br />![Object Adapter](https://www.dofactory.com/images/diagrams/net/adapter.gif)<br /><br />

We used a simple example to explain the power of this pattern. We have a class called `Catalog` that we use to print all 
products available in our store. But this class is very old and still uses a `Enumeration` to traverse for all the items.
As the new collections, like `ArrayList`, has only support for the new way to traverse collections (using `Iterator`) 
we needed to create a adaoter which can convert a `Iterator` into a `Enumeration`.

## Relationship with other patterns

`Facade` defines a new interface for existing objects, whereas `Adapter` tries to make the existing interface usable.
`Adapter` usually wraps just one object, while `Facade` works with an entire subsystem of objects.

## Pros and Cons

### Pros

+ `Single Responsibility Principle`. You can separate the interface or data conversion code from the primary business 
logic of the program.
+ `Open/Closed Principle`. You can introduce new type of Adapters into the program without breaking the existing client
code, as long as they work with the adapters through the client interface.

### Cons

+ The overall complexity of the code increases because you need to introduce a set of new interfaces and classes.
Sometimes it's simpler just to change the service class so that it matches the rest of your code.

## Real world examples

`Adapter` is another pattern very useful in a lot of frameworks.

For instance, in the `Android SDK` we've a very popular UI component called `RecyclerView` which we use to render a 
list of items. But `RecyclerView` only knows how to show `View` objects. We need to provide an `Adapter` in order to make
use of this component. The `RecyclerViewAdapter` help us to convert a list of any kind of items in the domain the `RecyclerView`
component needs to do its job.


