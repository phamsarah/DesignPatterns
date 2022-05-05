Notes:

    ** The Open-Closed Principle **
      * _ Classes should be open for extension, but closed for modification _
      * Goal is to allow classes to be easily extended to incorporate new behavior without modifying existing code. we get designs that are resilient to change and flexible enough to take on new functionality to meet changing requirements
      * Applying this design principle everywhere is wasteful and unnecessary and can lead to complex, hard to understand code


    ** Decorator Pattern **
      * _ Give objects new responsibilities without making code changes to underlying classes _
      * Definition: attaches additional responsibilities to an object dynamically. Provides a flexible alternative to subclassing for extending functionality. 
        * Each decorator has a ( AKA WRAPS) a component, means the decorator has an instance variable that holds a reference to a component
      * Decorators have the same super type as the objects they decorate
      * You can use one or more decorators to wrap an object
      * Since decorator has the same super type as the object it decorates, we can pass around a decorated object in place of the original wrapped object
      * Decorator adds its own behavior before and or after delegating to the object it decorates to do the rest of the job 
      * Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as we like
      * Composition and delegate can often be used to add new behaviors at runtime 
      * cons - can lead to large number of small classes that can be overwhelming 


    ** Inheritance vs Composition **
      * Using inheritance in Decorator pattern for type matching, not to get behavior
      * When we compose a decorator with a component, we are adding new behavior, acquiring new behavior not by inheriting it from a superclass, but by composing objects together 
      * behavior comes in through the composition of decorators with the base components as well other decorators 
      * since we are using object composition, we get more flexibility with how to mix and match condiments and beverages
      * If we rely on inheritance, then our behavior can only be determined statically at compile time - we get only whatever behavior the superclass gives us or that we override. with composition, we can mix and match decorators at runtime


Side Note:
 When I inherit behavior by subclassing, the behavior is set statically at compile time. all subclasses must inherit the same behavior. If I extend an objects behavior through composition, I can do this dynamically at runtime