Observer Pattern
======================

The `Observer Pattern` defines a one-to-many dependency between objects so that when one object changes state, all of its
dependents are notified and updated automatically.

Depending on the style of notification, the observer may also be updated with new values. 

There are different ways to implement the `Observer Pattern`, but most revolve around a class design that includes *Subject*
and *Observer* interfaces.

<br />![Observer Pattern](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Observer_w_update.svg/500px-Observer_w_update.svg.png)<br /><br />

In our example we simulated a Weather Station. In this station, we have a device that plays the role of a `Subject`, providing
updates whenever the weather changes. Also, we have different ways to show weather's data: current condition, statistics like
min and max temperature, forecast and so on. Each of these displays acts as an `Observer`, registering and receiving updates
from Weather data in order to display information about it. This approach makes easy add/remove displays without changing
the weather data provider class.

## Pros and Cons

### Pros

+ `Open/Closed principle`. You can introduce new observers classes without having to change the the subject code.
+ You can establish relations between objects at runtime.

### Cons

+ Observers are notified in random order.


## Applicability

**Use the Observer Pattern when changes to the state of one object may require changing other objects, and the actual
set of objects is unknown beforehand or changes dynamically.**

You can often experience this problem when working with classes of graphical user interface. For instance, you create 
custom button classes, and you want to let clients hook some custom code to your buttons so that it fires whenever a user
presses a button.

You can add the subscription mechanism to your buttons, letting the clients hook up their custom code via custom
subscriber classes.

**Use the pattern when some objects in your app must observer other, but only for a limited time or in specific cases.**

The subscription list is dynamic, so subscribers can join or leave the list whenever they need to. 


