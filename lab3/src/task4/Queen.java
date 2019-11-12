package task4;

public class Queen extends Piece{
	@Override
	public boolean isLegalMove(Position a, Position b) {
		if(super.checkMoveInDiagonal(a, b) && super.checkMoveInLine(a, b))
			return true;
		return false;
	}
}
