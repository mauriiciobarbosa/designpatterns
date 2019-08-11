Template Method
======================

The `Template Method` defines the steps of an algorithm and allows subclasses to provide the
implementation for one or more steps.

This pattern lets subclasses redefine certain steps of an algorithm without changing
the algorithm's structure.

A `Template Method` also allows the use of hooks, which are methods that are declared in the abstract class, but only
given an empty or default implementation. This gives subclasses the ability to "hook into" the algorithm into various 
points, if they wish. A subclass is also free to ignore the hook.

<br />![Template Method](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4IZP6QelikWoQVSSj1IXBDHo6GDr8H72RugbYj2Y2iaqrlye3)<br /><br />

In our example we used `Template Method` to create a Caffeine beverage. These beverages have a common preparation process:
boil the water, brew, pour into cup and add condiments. But two steps of this process changes according to the beverage type.
So, we choose to create a base class called `CaffeineBevarage` which encapsulates the preparation process (algorithm) and 
delegates to its subclasses some steps. 

Following this approach we have some benefits:
* We protect the algorithm. 
* The `CaffeineBeverage` maximize reuse among the subclasses.
* The algorithm lives in one place and code changes only need to be made there.
* The `Template Method` version provides a framework that other caffeine beverages can be plugged into. New caffeine 
beverages only need to implement a couple of methods.
* The `CaffeineBeverage` class concentrates knowledge about the algorithm and relies on subclasses to provide complete implementations.

## Applicability

This pattern shows up so often because it's a great design tool for creating frameworks, where the framework controls how
something gets done, but leaves you (the person using the framework) to specify your own details about what is actually
happening at each step of the framework's algorithm.

## Relationship with other patterns

The `Strategy` and `Template Method` patterns both encapsulate algorithms. `Templated Method` is based on inheritance: 
it lets you extending those parts in subclasses. `Strategy` is based on composition: you can alter parts of the object's
behavior by supplying it with different strategies that correspond to that behavior. `Templated Method` works at class 
level, so it's static. `Strategy` works on the object level, letting you switch behaviors at runtime.

The `Factory Method` is a specialization of `Template Method`.

## Pros and Cons

### Pros

+ You can let subclasses override only certain parts of a large algorithm, making them less affected by changes that
happen to other parts of the algorithm.
+ You can pull the duplicate code into a superclass.
+ `Hollywood Principle`. Clients will depend on the abstraction rather than a concrete class, which reduces dependencies 
in the overall system. 

### Cons

+ Some clients may be limited by the provided skeleton of an algorithm.
+ You might violate the `Liskov Substitution Principle` by suppressing a default step implementation via a subclass.
+ `Template Method` tends to be harder to maintain the more steps they have.

## Real world examples

`Template Method` is a pattern very common to see in extensible frameworks.

The `Java Arrays Class` have provided us with a handy template method for sorting. The `sort()` template method in `Arrays`
give us the algorithm to sort different types of objects, but we need to tell it how to compare these objects, which you
do by implementing the `compareTo()` method. `Template Method` often uses subclasses to fill steps of the algorithm, but
the `sort()` method works slightly different because its designers wanted it to be useful across all the arrays.

The `Activity` class in the `Android SDK` is another example of `Template Method`. This class provides
some hooks while transitioning between different states, like `onCreate()` method which you can override for setting 
the UI to be displayed through `setContentView(View)` method.


