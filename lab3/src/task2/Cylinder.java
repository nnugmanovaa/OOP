package task2;

public class Cylinder extends Shape {
	private Double radius;
	private Double height;

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double volume() {
		return Math.PI * this.radius * this.radius * this.height;
	}

	@Override
	public double surfaceArea() {
		return 2 * Math.PI * this.radius * this.radius + 2 * Math.PI * this.radius * this.height;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cylinder))
			return false;

		Cylinder cylinder = (Cylinder) obj;
		return this.radius.equals(cylinder.radius) && this.height.equals(cylinder.height);
	}

	@Override
	public String toString() {
		return ("Volume of cylinder is " + volume() + ", Surface area of cylinder is " + surfaceArea());
	}

}
