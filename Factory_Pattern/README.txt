Notes:
**Quick Notes/Bullet Points**
    * All factories encapsulate object creation
    * Simple Factory, while not a bona fide design pattern, is a simple way to decouple your clients from concrete classes
    * Factory Method relies on inheritance: Object creation is delegated to subclasses, which implement the factory method
        to create objects
    * Abstract Factory relies on object composition: object creation is implemented in methodsd exposed in the factory interface
    * The intent of Factory Method is to allow a class to defer instantiationto its subclasses
    * The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes
    * The Dependency Inversion Principle guides us to avoid dependencies on concrete types and to strive for abstractions
    * Factories are a powerful technique for coding to abstractions, not concrete classes

* "New" = Concrete
    - Instantiating a concrete class - implementation not an interface 
    - More fragile and less
    - Handles object creation and encapsulates it in a subclass. This decouples the client code in the superclass from the object 
    creation code in the subclass.
    - Defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class 
    defer instantiation to subclasses.


** The Dependency Inversion Principle **
    * Depend upon abstractions. Do not depend upon concrete classes.
    * Higher/Lower level components both depend on abstractions
    * No variable should hold a reference to a concrete class (Don't use 'new' - use factory)
    * No class should derive from a concrete class (Derive from Abstraction)
    * No method should override an implemented method of any of its base classes (if you override, then base class isn't an abstraction)

** Abstract Factory **
    * Provides an interace for a family of product without specifying their concrete classes. In our case a family is all the things 
        we need to make a pizza. 
    * We decouple our code from the actual factory that creates the products.
    * Objectville Abstract Ingredient Factory (Defines the interface) -> New York/Chicago (Provides the implementation for products) ->
        Pizza Store (Uses factory to make products, variety of factories makes a variety of implementations of products) -> Resulting Pizza

** Abstract Factory vs Factory Method **
    * Factory uses classes to create and abstract uses objects
    * Both create objects, but Factory creates them through inheritance and abstract through composition
    * To create objects using Factory, extend a class and provide an implementation for a factory Method
        - Using a subclass to do your creation for you, so clients only need to know the abstract type 
        - Keep clients decoupled from the concrete types
    * Abstract Factory provides an abstract type for creating family of products. Instantiate a factory, pass it into something written
        against abstract type, clients are decoupled from concrete types 
        - Groups together a set of related products
        - Interface has to change if new products are added
        - Concrete methods use Factory methods to create their products 

Programs:
- pizzafm: Pizza store with factory method pattern
- pizzaaf: Pizzafm but with Dependency Inversion Principle and Abstract Factory
    * PizzaIngredientFactory - AbstractFactory <<Interface>> -  Interface for the factory
        - NYPizzaIngredientFactory - ConcreteFactory1 - Factory, implements PizzaIngredientFactory
        - ChicagoPizzaIngredientFactory - ConcreteFactory2 
    * Pizza - Abstract class, holds set of ingredients
        - CheesePizza - Concrete Product, implements Pizza, prepares() CheesePizza and holds PizzaIngredientFactory
        - ClamPizza
    * PizzaStore - Client
        - NYPizzaStore - implements PizzaStore
        - ChicagoStylePizzaStory 
    * Dough <<Interface>> - Abstract Product A
        - ThickCrustDough
        - ThinCrustDough
    * Sauce <<Interface>> - Abstract Product B 
        - PlumTomatoSauce
        - MarinaraSauce