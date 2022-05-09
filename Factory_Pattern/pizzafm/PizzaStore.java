package designpatterns.factory_pattern.pizzafm;

// Creator Class
public abstract class PizzaStore {
 
	// All responsibility for instantiating Pizzas has been moved into a method that acts as a factory
	// Isolates the client in the superclass, like orderPizza from knowing what kind of ocncrete Product is created
	// Abstract so the subclasses are counted on to handle object creation
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
