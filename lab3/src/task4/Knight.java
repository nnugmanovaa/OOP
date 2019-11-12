package task4;

public class Knight extends Piece {
	public static boolean checkKnightMove(Position a, Position b) {
		if (Math.abs(a.getX() - b.getX()) == 1 && Math.abs(a.getY() - b.getY()) == 2
				|| Math.abs(a.getY() - b.getY()) == 1 && Math.abs(a.getX() - b.getX()) == 2)
			return true;
		return false;
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		if (checkKnightMove(a, b))
			return true;
		return false;
	}

}
