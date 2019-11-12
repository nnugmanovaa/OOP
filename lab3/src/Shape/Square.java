package Shape;

public class Square extends Shape {

	public Square(Color color, int x) {
		super(color, x);
	}

	@Override
	public void draw() {
		for (int i = 0; i < x; i++) {
			System.out.print(" ");
		}
		if (color == Color.BLACK) {
			System.out.println("[]");
		} else
			System.err.println("[]");
	}
}
