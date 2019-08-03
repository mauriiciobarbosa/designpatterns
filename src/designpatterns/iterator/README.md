Iterator Pattern
======================

The `Iterator Pattern` provides a way to access the elements of an aggregate object sequentially without exposing its 
underlying representation.

Once you have a uniform way of accessing the elements of all your aggregate objects, you can write polymorphic code 
that works with any of these aggregates.

It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregate
interface and implementation, and places the responsibility where it should be.

<br />![State Pattern ](https://www.researchgate.net/profile/Yann-Gael_Gueheneuc/publication/249885094/figure/download/fig22/AS:532128967868416@1503880840237/UML-class-diagram-for-Iterator-pattern.png)<br /><br />

In our example we created a virtual waitress to print menus from different houses. Each house has your own menu items 
collection implementation. We made each type of menu exposes the same type of container, using the `iterator pattern`, 
in order to simplify the waitress' code. Then, we did not have to change the concrete menus implementation. Furthermore, 
we made each menu house implements the same interface to provide a name and a object to iterate over the collection. 
Finally, adding and removing menus from the waitress became easier.


## Relation with other Patterns

+ You can use `Iterators` to traverse `Composite` trees.
+ You can use `Factory Method` along with `Iterator` to let collection subclasses return different types of iterators
that are compatible with the collections.
+ You can use `Memento` along with `Iterator` to capture the current state and roll it back if necessary.
+ You can use `Visitor` along with `Iterator` to traverse a complex data structure and execute some operation
over its elements, even if they all have different classes.

## Pros and Cons

### Pros

+ `Single Responsibility Principle`. You can clean up the client code and the collections
by extracting bulky traversal algorithms into separate classes.
+ `Open/Closed Principle`. You can implement new types of collections and iterators and pass it
to existing code without breaking anything.
+ You can iterate over the same collection in parallel because each iterator object
 contains its own iteration state.
+ For the same reason, you can delay an iteration and continue it when needed.

### Cons

+ Applying the pattern can be overkill if your app only works with simple collections.
+ Using an iterator may be less efficient than going through elements of some specialized collection directly.

## Real world examples

The most famous example of `Iterator Pattern` is in the `Java collections API`. 

There are plenty of different types of aggregate objects in this API, for instance `HashMap` and `ArrayList`, each one with 
a different strategy to store and manage related objects. But all collections provides a common way to iterate throughout
the items using an Iterator.
