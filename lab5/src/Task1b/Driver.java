package Task1b;

public class Driver {

	public static void main(String[] args) {
		Plane plane = new Plane(8, 4, 15);
		plane.move(18, 10);
		plane.fly();
		System.out.println(plane);
	}

}
