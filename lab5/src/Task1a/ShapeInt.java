package Task1a;

public interface ShapeInt {
	// 1. Variables are final by default
	double RADIUS = 5;

	// 2. Methods in Interfaces are public abstract by default
	double getVolume();

	// Java 8 introduced the concept of default methods which allow the interfaces
	// to have methods with implementation without affecting the classes that
	// implement the interface.
	
	default void show() {
		System.out.println("Default method executed");
	}

	// 3.Interfaces can be empty at all(marker interfaces)
	
	// 4.Interface can extend another Interface only
}
