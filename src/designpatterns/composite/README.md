Composite Pattern
======================

The `Composite Pattern` allows you to compose objects into tree structures to represent part-whole hierarchies.
Composite lets clients treat individual objects and compositions of objects uniformly.

Using a design pattern that follows the `Composite Pattern` allow us to write some simple code that can apply the same
operation (like printing) over the entire structure. In most cases we can ignore the differences between 
compositions of objects and individual objects.

<br />![Composite Pattern ](http://www.java2novice.com/images/composite.png)<br /><br />

In our example we created a math framework to handle basic math operations using the `Composite Pattern`. Each operation 
is wrapped into a `composite object` which contains two other components. Each component can be a number (`leaf`) or another 
operation. In order to get the result we just need to execute the `eval()` method at the root component. 
The root component delegates to their children the operation and uses the result to calculate its operation.

## Pros and Cons

### Pros

+ You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
+ `Open/Closed Principle`. You can introduce new element types into the app without breaking the existing code, which now
works with the object tree.

### Cons

+ It might be difficult to provide a common interface for classes whose functionality differs too much. In certain 
scenarios, you'd need to overgeneralize the component interface, making it harder to comprehend.

## Real world examples

The structure of `Component` and `Container` classes in `java.awt` provide a good example of the `Composite Pattern`.

The `JSF Framework` also uses this pattern to provide a set of UI elements. `UIComponentBase` represents an abstract
Component class in the `Composite Pattern`. `UIViewRoot` is the `Composite` class, and `UIOutput`, for example, is the
leaf. The `UIComponentBase` class defines common methods for leaf and composite objects, such as encoding and decoding 
values and management functions.
