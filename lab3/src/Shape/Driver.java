package Shape;

import java.util.Vector;

public class Driver {

	public static void main(String[] args) {
		Vector<Shape> v= new Vector<Shape>();
		v.add(new Circle(Color.BLACK, 4, 1));
		v.add(new Circle(Color.RED, 3, 3));
		v.add(new Square(Color.RED, 7));
		v.add(new Square(Color.BLACK, 8));
		
		
		for(Shape s:v)
		{
			s.draw();
		}
	}

}
