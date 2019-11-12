package task4;

public abstract class Piece {

	public static boolean checkMoveInLine(Position a, Position b) {
		if (a.getX() == b.getX() || a.getY() == b.getY())
			return true;
		return false;
	}

	public static boolean checkMoveInDiagonal(Position a, Position b) {
		if (Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()))
			return true;
		return false;
	}

	public abstract boolean isLegalMove(Position a, Position b);
}
