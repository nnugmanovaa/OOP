package task4;

public class Bishop extends Piece {
	@Override
	public boolean isLegalMove(Position a, Position b) {
		if (super.checkMoveInDiagonal(a, b))
			return true;
		return false;
	}
}
