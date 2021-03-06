# Bridge Design Pattern

Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies — abstraction and implementation — which can be developed independently of each other.

## Summary

* Our implementations & abstractions are generally coupled in normal inheritance. 
* Using bridge design pattern we can de-couple them so they can change without effecting each other.
* We achieve this feat by creating two separate inheritance hierarchies: one for implementation and other one is for abstraction.
* We use Composition to bridge these two hierarchies.

## During Implementation

* Start by defining abstraction as needed by client.
    * Determine common base operations and define them in abstraction.
    * Define the implementor next. Implementor methods do not have to match with abstractor.
    * Write one or more concrete implementor providing implementation
* Abstractions are created by composing them with an instance of concrete implementor which is used by methods in abstractions.

## Implementation Considerations

* In case there is going to be a single implementation then abstract implementor can be skipped.
* Abstraction can decide on its own which concrete implementor to use in its constructor or we can delegate that decision to a third class. In last approach abstraction remains unaware of concrete implementors & provides great de-coupling.

## Design Considerations

* Bridge provides great extensibility by allowing us to change abstraction and implementor independently. You can build and package them separately to modularize overall system.
* By using abstract factory pattern to create abstraction objects with correct implementation you ca de-couple concrete implementors from abstraction.

## Pitfalls

* It is fairly complex to understand & implement bridge design pattern.
* You need to have a well thought out & fairly comprehensive design in front of you before you can decide on bridge pattern.
* Needs to be designed up front. Adding bridge to legacy code is difficult. 

## Compare & Contrast with Adapter

Bridge  | Adapter
------------- | -------------
Intent is to allow abstraction and implementation to vary independently. | Adapter is meant to make unrelated class work together.
Bridge has to be designed up front then only we can have varying abstractions & implementations. | Adapter finds its usage typically where a legacy system is to be integrated with new code.

## Bridge Pattern UML Diagram

![Bridge Method UML](https://github.com/ugurcancetin/Design-Patterns-Java8/blob/master/Structural%20DPs/Bridge-DP/Bridge-DP.PNG)
