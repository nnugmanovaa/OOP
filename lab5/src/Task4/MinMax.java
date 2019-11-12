package Task4;

public class MinMax {
	static class Inner {
		private int max;
		private int min;

		public Inner(int max, int min) {
			this.max = max;
			this.min = min;
		}

		public void setMax(int max) {
			this.max = max;
		}

		public int getMax() {
			return max;
		}

		public void setMin(int min) {
			this.min = min;
		}

		public int getMin() {
			return min;
		}

		@Override
		public String toString() {
			return String.format("Max: %d\nMin: %d", max, min);
		}

	}

	static Inner minMax(int array[]) {
		int maxi = -10000;
		int mini = 100000;
		for (int i = 0; i < array.length; i++) {
			if (maxi < array[i])
				maxi = array[i];
			if (mini > array[i])
				mini = array[i];
		}

		Inner inner = new Inner(maxi, mini);
		return inner;
	}
}
