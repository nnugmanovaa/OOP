package task4;

public class King extends Piece {
	public static boolean checkMoveInLine(Position a, Position b) {
		if (Math.abs(a.getX() - b.getX()) == 1 || Math.abs(a.getY() - b.getY()) == 1)
			return true;
		return false;
	}

	public static boolean checkMoveInDiagonal(Position a, Position b) {
		if ((Math.abs(a.getX() - b.getX())) == 1 && (Math.abs(a.getY() - b.getY())) == 1)
			return true;
		return false;
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		if (checkMoveInLine(a, b) && checkMoveInDiagonal(a, b))
			return true;
		return false;
	}
}
