package task4;

public class Pawn extends Piece {
	public boolean checkPawnMove(Position a, Position b) {
		if(a.getY() - b.getY() == 1)
			return true;
		return false;
	}
	@Override
	public boolean isLegalMove(Position a, Position b) {
		if (checkPawnMove(a,b))
			return true;
		return false;
	}
}
