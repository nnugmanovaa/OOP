package task2;

public class Cube extends Shape {
	private Double side;

	public Cube(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double volume() {
		return Math.pow(this.side, 3);
	}

	public double surfaceArea() {
		return 6 * Math.pow(side, 2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cube))
			return false;

		Cube cube = (Cube) obj;
		return this.side.equals(cube.side);
	}

	@Override
	public String toString() {
		return ("Volume of cube is " + volume() + ", Surface area of cube is " + surfaceArea());
	}

}
