Singleton Pattern
======================

The `Singleton Pattern` ensures a class has only one instance, and provides a global point of access to it.

This pattern takes a class and lets it manage single instance of itself. It also prevents any other class from
creating a new instance of its own.

Furthermore, the `Singleton Pattern` also provides a global access point to the instance: whenever you need a instance,
just query the class and it will hand you back the single instance. 

<br />![Singleton Pattern](https://reactiveprogramming.io/public/books/patterns/img/patterns-articles/singleton-diagram.png)<br /><br />

In our example we use a `Database` class as a shared resource between two features: `FeatureA` and `FeatureB`. As the `Database`
is a heavy resource to initialize every time, we made it a singleton in order to reuse the same instance among these 
features classes.

## Pros and Cons

### Pros

+ You can be sure that a class has only a single instance.
+ You gain a global access point to that instance.
+ The singleton object is initialized only when it's first requested.

### Cons

+ Violates the `Single Responsibility Principle`. The pattern solves two problems at the time.
+ The `Singleton Pattern` can mask bad design, for instance, when the components of the program know too much about each other.
+ The pattern requires special treatment in a multithreaded environment so that multiple threads won't create a singleton 
object several times.
+ It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when
producing mock objects. Since the constructor of the singleton class is private and overriding static methods is impossible
in most languages, you will need to think of a creative way to mock the singleton. Or just don't write the tests. Or don't
use the Singleton pattern.


## Applicability

**Use the Singleton Pattern when a class in your program should have just a single instance available to all clients; for
example, a single database object shared by different parts of the program**

The `Singleton Pattern` disables all other means of creating objects of a class except for the special creation method.
This method either creates a new object or returns an existing one if it has already been created.

**Use the Singleton pattern when you need stricter control over global variables**

Unlike global variables, the `Singleton Pattern` guarantees that there's just one instance of a class. Nothing, except
for the Singleton class itself, can replace the cached instance.


