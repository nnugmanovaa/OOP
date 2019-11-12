package Task1;

public class Parallel extends Circuit {
	private Circuit a;
	private Circuit b;
	
	public Parallel(Circuit a , Circuit b) {
		this.a = a;
		this.b = b;
	}

	public double getResistance() {
		return a.getResistance() * b.getResistance() / (a.getResistance() + b.getResistance());
	}

	public void applyPotentialDiff(double v) {
		a.applyPotentialDiff(v);
		b.applyPotentialDiff(v);
	}

	public double getPotentialDiff() {
		if (a.getPotentialDiff() == b.getPotentialDiff())
			return a.getPotentialDiff();
		else
			throw new RuntimeException();
	}
}
