package Task4;

import four.Time;

public class Chocolate implements Comparable {
	private String name;
	private double weight;

	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String toString() {
		return String.format("Chocolate name : %s, weight : %2f", name, weight);
	}

	public int compareTo(Object obj) {
		Chocolate chl = (Chocolate) obj;
		if (this.weight > chl.weight)
			return 1;
		if (this.weight < chl.weight)
			return -1;
		else
			return 0;	
	}
}
