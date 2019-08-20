Command Pattern
======================

The `Command Pattern` allows you to decouple the requester of an action from the object that
performs the action.

This pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests,
queue or log requests, and support undoable operations.


<br />![Command Pattern](https://www.dofactory.com/images/diagrams/net/command.gif)<br /><br />

In our example we create a list of menus which are able to handle click actions. The `MenuTestDrive` (client) can perform
a click just asking the action (Command) to handle it. Each action has a `Router` (receiver) to invoke in order to
handle clicks. Using `Command Pattern` we can create new menus without breaking the client.

## Applicability

- Use the `Command Pattern` when you want to parametrize objects with operations.
- Use the `Command Pattern` when you want to queue operations, scheduler their execution, or execute them remotely.
- Use the `Command Pattern` when you want to implement reversible operations.

## Pros and Cons

### Pros

+ `Single Responsibility Principle`. You can decouple classes that invoke operations from classes that perform these
operations.
+ `Open/Closed Principle`. You can introduce new commands into the app without breaking existing client code.
+ You can implement undo/redo.
+ You can implement deferred execution of operations.
+ You can assemble a set of simple commands into a complex one.


### Cons

+ The code may become more complicated since you're introducing a whole new layer between senders and receivers.

## Real world examples

The `Java Swing` classes support the `Command Pattern` by providing an `Action` interface and an `AbstractAction` class.

`Struts` controller uses the `Command Pattern` design.


