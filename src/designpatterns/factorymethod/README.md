Factory Method Pattern
======================

`The Factory Method Pattern` defines an interface for creating an object, but lets subclasses decide which class to instantiate.
Factory Method lets a class defer instantiation for subclasses.

All factory patterns encapsulate object creation. The `Factory Method` pattern encapsulates object creation by letting
subclasses decide what objects to create. This decouple the client code in the superclass from the object creation code 
in the subclass.

Looking in te class diagram below, you can see that the abstract `Creator` gives you an interface with a method to creating
objects, also known as the `factory method`. Any other methods implemented in the abstract Creator are written to operate
on `products` produced by the factory method. Only subclasses actually implement the factory method and create products.

<br />![Factory Method Pattern](https://www.dofactory.com/images/diagrams/net/factory.gif)<br /><br />

In our example we created a framework that ties the store and the pizza creation together, yet still allows things to 
remain flexible. The `PizzaStore` class is the abstract Creator which defers to subclasses (pizza stores from different places)
the creation of `Pizza` (the product) in order to prepare it.

## Pros and Cons

### Pros

+ You avoid tight coupling between the creator and the concrete products.
+ `Single Reponsibility Principle`. You can move the product creation code into one place in the program, making the code
easier to support.
+ `Open/Closed Principle`. You can introduce new types of products into the program without breaking existing client code.

### Cons

+ The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best
case scenario is when you're introducing the pattern into an existing hierarchy of creator classes.


## Relations with other Patterns

+ `Abstract Factory` classes are often based on a set of `Factory Methods`, but you can also use `Prototype` to compose
the methods on these classes.
+ `Factory Method` is a specialization of `Template Method`. At the same time, a Factory Method may serve as a step in a
large Template Method.

## Applicability

**Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.**

Inheritance is probably the easiest way to extend default behavior of a library or framework. But how would the framework
recognize that your subclass should be used instead of a standard component?

The solution is to reduce the code that constructs components across the framework into a single factory method and let
anyone override this method in addition to extend the component itself.

Let's see how that would work. Imagine that you write an app using an open source UI framework. You app should have
round buttons, but the framework only provides square ones. You extend the Standard `Button` class with a `RoundButton`
subclass. But now you need to tell the main `UIFramework` class to use the new button subclass instead of a default one.

To achieve this, you create a subclass `UIWithRoundButtons` from a base framework class and override its `createButton`
method. While this method returns `Button` objects in the base class, you make your subclasses return `RoundButton` objects.
Now use the `UIWithRoundButtons` class instead of `UIFramework`. And that's all about.


