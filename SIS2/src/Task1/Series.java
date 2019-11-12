package Task1;

public class Series extends Circuit {
	private Circuit a, b;

	public Series(Circuit a , Circuit b) {
		this.a = a;
		this.b = b;
	}
	public double getPotentialDiff() {
		return a.getPotentialDiff() + b.getPotentialDiff();
	}

	public double getResistance() {
		return a.getResistance() + b.getResistance();
	}

	public void applyPotentialDiff(double v) {
		double I = v / getResistance();
		a.applyPotentialDiff(I * a.getResistance());
		b.applyPotentialDiff(I * b.getResistance());
	}
}
