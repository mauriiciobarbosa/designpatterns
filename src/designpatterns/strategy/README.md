Strategy Pattern
======================

`Strategy` is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class,
and make their objects interchangeable.


<br />![Strategy Pattern](https://www.dofactory.com/images/diagrams/net/strategy.gif)<br /><br />

In our example we used `Strategy` to encapsulate the behaviors of a *duck*, like *fly* and *quack*. In that way is
simple to reuse them among the different types of ducks.

## Relationship with other patterns

`State` can be considered as an extension of `Strategy`. Both patterns are based on composition: they change the behavior
of the context by delegating some work to helper objects. *Strategy* makes these objects completely independent and unaware
of each other. However, *State* doesn't restrict dependencies between concrete states, letting them alter the state of
the context at will.

## Pros and Cons

### Pros

+ You can swap algorithms used inside an object at runtime.
+ You can isolate the implementation detail of an algorithm from the code that uses it.
+ You can replace inheritance with composition.
+ `Open/Closed Principle`. You can introduce new strategies without having to change the context.

### Cons

+ If you only have a couple of algorithms and they rarely change, there's no real reason to overcomplicate the program
with new classes and interfaces that come along with the pattern.
+ Clients must be aware of the differences between strategies to be able to select a proper one.

## Applicability

**Use the Strategy pattern when yout want to use different variants of an algorithm within an object and
be able to switch from one algorithm to another during runtime.**

The *Strategy* pattern lets you indirectly alter the object's behavior at runtime by associating it with
different sub-objects which can perform specific sub-tasks in different ways.

**Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not
be as important in the context of that logic.**

The *Strategy* pattern lets you isolate the code, internal data, and dependencies of various algorithms from the rest of
the code. Various clients get a simple interface to execute the algorithms and switch them at runtime.


