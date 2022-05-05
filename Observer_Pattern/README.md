Notes:
    **The Power of Loose Coupling**
      * The only thing the subject knows about an observer is that it implements a certain interface
      * We can add new observers at any time
      * We never need to modify the subject to add new types of observers
      * We can reuse subjects or observers independently of each other
      * Changes to either the subject or an observer will not affect the other
      * Loosely coupled design allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects

    ** Bullet Points ** 
      * Defines a one-to-many relationship between objects
      * Subjects update observers using a common interface
      * Observers of any concrete type can participate in the pattern as long as they implement the observer interface
      * Observers are loosely coupled in that the Subject knows nothing about them, other than that they implement the Observer interface
      * You can push or pull data from the Subject when using the pattern 
      * Swing makes heavy use of the Observer pattern, as do many GUI frameworks
      * Related to the publish/subscribe pattern, which is more for complex situations with multiple subjects and/or multiple message types
      * Commonly used pattern, you will see it in the model-view-controller


    ** OO Principles **
      * Encapsulate what varies
        * State if the subject and the number and types of observers. You can vary the objects that are dependent on the state of the subject without changing the subject. Planning ahead
      * Favor composition over inheritance
        * Observer uses  composition to compose any number of observers with their subject. these relay ships aren’t set up by some kind of inheritance hierarchy, they are set up at runtime by composition.
      * Program to interfaces, not implementation
        * Subject and observer uses interfaces, subject keeps track of objects implementing the Observer interface, while Observers registered with and get notified by the Subject interface. nice and loosely coupled
      * Strive for loosely coupled designs between objects that interact