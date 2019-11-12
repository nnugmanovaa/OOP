package task1;

public class Polynomial {
	private double coefs[];
	// public double sum[];

	public Polynomial(double coefs[]) {
		this.coefs = coefs;

	}

	public double[] getCoefs() {
		return this.coefs;
	}

	public double findF(double x) {
		double output = 0;

		for (int i = 0; i < coefs.length; i++)
			output += coefs[i] * Math.pow(x, i);

		return output;
	}

	public int degree() {
		return coefs.length - 1;
	}

	public static String printSum(Polynomial a, Polynomial b) {
		double sum[] = new double[Math.max(a.getCoefs().length, b.getCoefs().length)];
		for (int i = 0; i < a.getCoefs().length; i++)
			sum[i] += a.coefs[i];

		for (int i = 0; i < b.getCoefs().length; i++)
			sum[i] += b.coefs[i];

		StringBuilder stb = new StringBuilder();
		for (int i = 0; i < sum.length; i++) {
			if (i == 0)
				stb.append(String.format("%.2f + ", sum[i]));
			else if (i == sum.length - 1)
				stb.append(String.format("%.2f*x^%d", sum[i], i));
			else
				stb.append(String.format("%.2f*x^%d + ", sum[i], i));
		}

		return stb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < coefs.length; i++) {
			if (i == 0)
				sb.append(String.format("%.2f + ", coefs[i]));
			else if (i == coefs.length - 1)
				sb.append(String.format("%.2f*x^%d", coefs[i], i));
			else
				sb.append(String.format("%.2f*x^%d + ", coefs[i], i));
		}

		return sb.toString();
	}

}
