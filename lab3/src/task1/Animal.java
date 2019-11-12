package task1;

public class Animal {
	private String name;
	private int age;

	public Animal() {
		age = 0;
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int inc()
	{
		return ++this.age;
	}
	
	public String toString()
	{
		return this.name;
	}
}
