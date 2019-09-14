Abstract Factory Pattern
======================

`The Abstract Factory Pattern` provides an interface for creating families of related or dependent objects without
specifying their concrete classes.

An `Abstract Factory` gives us an interface for creating a family of products. By writing code that uses this interface,
we decouple our code from the actual factory that creates the products. That allows us to implement a variety of factories
that produce products meant for different contexts - such as different regions, different operating systems, or different
look and feels.

Applying this pattern makes your code decoupled from the actual products, so you can substitute different factories to
get different behaviors.

<br />![Abstract Factory Pattern](http://javacurious.files.wordpress.com/2013/03/af_dp.png?w=960)<br /><br />

In our example we created a framework to provide a family of ingredients in order to make pizzas. Each region has a
`PizzaIngredientFactory` that is used to provide ingredients for pizzas of different flavors.

## Pros and Cons

### Pros

+ You can be sure that the products you're getting from a factory are compatible with each other.
+ You avoid tight coupling between concrete products and client code.
+ `Single Responsibility Principle`. You can extract the product creation code into one place, making the code easier to support.
+ `Open/Closed Principle`. You can introduce new variants of products without breaking existing client code.

### Cons

+ The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along 
with the pattern.


## Relations with other Patterns

+ `Abstract Factory` classes are often based on a set of `Factory Methods`, but you can also use `Prototype` to compose
the methods on these classes.
+ `Abstract Factories`, `Builders` and `Prototypes` can all be implemented as `Singletons`.

## Applicability

**Use the Abstract Factory when your code needs to work with various families of related products, but you don't want it
to depend on the concrete classes of those products - they might be unknown beforehand or you simply want to allow for future
extensibility.**

The `Abstract Factory` provides you with an interface for creating objects from each class of the product family. As long
as you code creates objects via this interface, you don't have to worry about creating the wrong variant of a product which
doesn't match the products already created by your app.

