package Task1b;

public class Plane implements Flyable {

	private int x;
	private int y;
	private double height;
	private double distance;

	public Plane(int x, int y, double height) {
		this.x = x;
		this.y = y;
		this.height = height;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getDistance() {
		return distance;
	}

	@Override
	public void move(int x_, int y_) {
		distance+= Math.sqrt(Math.pow(x_ - x, 2) + Math.pow(y_ - y, 2));
	}

	@Override
	public double fly() {
		return height;
	}

	@Override
	public String toString() {
		return "Boeing 777-300ER finished his first flight with the distance: " + getDistance() + " "
				+ "on the height: " + fly();
	}
}
