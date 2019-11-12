package task4;

public class Rock extends Piece {
	@Override
	public boolean isLegalMove(Position a, Position b) {
		if (super.checkMoveInLine(a, b))
			return true;
		return false;
	}
}
