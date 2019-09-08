Facade Pattern
======================

The `Facade Pattern` provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level
interface that makes the subsystem easier to use.

To use the `Facade Pattern`, we create a class that simplifies and unifies a set of more complex classes that belong to
some subsystem.

The Facade allows us to avoid tight coupling between clients and subsystem, and also helps us adhere to the 
`Principle of Least Knowledge`.

<br />![Facade Adapter](https://anandabhisheksingh.me/wp-content/uploads/2018/09/facade_pattern.png)<br /><br />

In our example we create a `HomeTheater` class to "coordinate" the use of different devices (`DvdPlayer`, `Projector`, 
`PopcornPopper`, etc). The `HomeTheaterTestDrive` class acts as a client, it doesn't talk with all devices to make
some action, like watch a movie, it just need to ask the `HomeTheater` class which knows all the steps needed to complete 
the task.

## Relationship with other patterns

`Facade` defines a new interface for existing objects, whereas `Adapter` tries to make the existing interface usable.
`Adapter` usually wraps just one object, while `Facade` works with an entire subsystem of objects.

`Abstract Factory` can serve as an alternative to `Facade` when you only want to hide the way the subsystem objects are
created from the client code.

## Pros and Cons

### Pros

+ You can isolate your code from the complexity of a subsystem.

### Cons

+ A facade can become a god object coupled to all classes of an app.

## Applicability

**Use the Facade pattern when you need to have a limited bu straightforward interface to a complex subsystem**

Often, subsystems get more complex over time. Even applying design patterns typically leads to creating more classes. A
subsystem may become more flexible and easier to reuse in various contexts, but the amount of configuration and boilerplate
code it demands from a client grows ever larger. The Facade attempts to fix this problem by providing a shortcut to the
most-used features of the subsystem which fits most clients requirements.

**Use the Facade when you want to structure a subsystem into layers**

Create facades to define entry points to each level of a subsystem. You can reduce coupling between multiple subsytems
by requiring them to communicate only through facades.


