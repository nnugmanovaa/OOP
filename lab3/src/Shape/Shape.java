package Shape;

public abstract class Shape {
    protected Color color;
	protected int x;

	public Shape(Color color, int x) {
		this.color = color;
		this.x = x;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public abstract void draw();

}
