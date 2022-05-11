Notes:
     Singleton Pattern
       * Ensures you have at most one instance of a class in your applicaiton
       * Provides a global access point to that instance
       * Java's implementation makes use of a private constructor, a static method combined with a static variable
       * Examine your performance nad resource constraints and carefully choose an appropriate Singleton implementation for
            multithreaded applications
       * Beware of the double-checked locking implementation, it isn't thread safe in versions before Java 5
       * Be careful if you are using multiple class loaders, this could defeat the Singleton implementation and result in multiple instances
       * Use Java's enums to simplify your Singleton implementation
       * Don't instantiate, just ask for a instance, getInstance() and returns the instance of the Singleton class


* Only ONE INSTANCE EVER
* Global Variable vs Singleton 
  * Global variables are created when the application begins, singleton creates objects when we need them
* Static - class method, use the class name to reference the static method

_Class Diagram_
|   Singleton   |
-----------------
static uniqueInstance   * Holds our one and only instance of the Singleton
-----------------
static getInstance()    * Static -> class method, can conveniently access this from ANYWHERE

* Files 
  - classic: Beginner dissection of Singleton Pattern implementation    
  - chocolate: Chocolate example of Singleton Pattern with two instances 
  - threadsafe: classic file but Dealing with Multi-threading
  - stat: threadsafe file but Improved Multi-threading using Static Initializer - rely on JVM
  - dcl: stat file but with 'Double-Checked Locking' - reduces use of synchronization
  - enumS: Singleton Pattern using Enum