package Shape;

public class Circle extends Shape {
	private double radius;

	public Circle(Color color, int x, double radius) {
		super(color, x);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		for (int i = 0; i < x; i++) {
			System.out.print(" ");
		}
		if (color == Color.BLACK) {
			System.out.println("()");
		} else
			System.err.println("()");

	}

}
