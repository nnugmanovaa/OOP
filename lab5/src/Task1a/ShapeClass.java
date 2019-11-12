package Task1a;

public abstract class ShapeClass {

	// 1.Abstract class can contain all types of data
	public double radius = 6; 

	
	//2.Abstract can have non - abstract methods
	public abstract double volume();

	public double getVolume() {
		return 4 / 3 * Math.PI * Math.pow(radius, 3);
	}

	
	//3.Abstract class must have at least one abstract method 
	
	//4.An abstract class can extend another Java class and implement
	//multiple Java interfaces.
}
