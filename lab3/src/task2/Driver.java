package task2;

public class Driver {

	public static void main(String[] args) {
		Cylinder cl = new Cylinder(2.0, 5.0);
		Sphere sp = new Sphere(4);
		Cube cube = new Cube(5);
		
		System.out.println(cl.toString());
		System.out.println(sp.toString());
		System.out.println(cube.toString());

	}

}
