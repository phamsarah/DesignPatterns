package designpatterns.singleton_pattern.classic;

// NOTE: This is not thread safe!

public class Singleton {
	// Static variable holds the ONE instance of our class
	private static Singleton uniqueInstance;
 
	// Constructor is private so that only Singleton can instantiate this class
	private Singleton() {}
 
	// Lets us instantiate the class and return an instance
	public static Singleton getInstance() {
		if (uniqueInstance == null) { // If null, then we haven't created instance yet
			uniqueInstance = new Singleton(); // If doesn't exist, create Singleton - lazy instantiation
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
}
