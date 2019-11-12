package task1;

public class Dog extends Animal {
	private String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void printGeneral(String breed) {
		System.out.println(this.breed);

	}

	public void printGeneral(String breed, int age) {
		System.out.println(this.breed + " " + inc());
	}

	public String toString() {
		return super.toString() + " " + this.breed;
	}

}
