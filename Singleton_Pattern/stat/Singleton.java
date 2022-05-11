package designpatterns.singleton_pattern.stat;

public class Singleton {
	// Static initializer 
	// Rely on JVM to create the unique instance of the Singleton, guarantees the instance will be created before any thread
	// 	accesses the static uniqueInstance variable
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
