package one;

public class Student {

	private String name;
	private String id;
	private int year;

	public Student(String name, String id, int year) {
		this.name = name;
		this.id = id;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return id;
	}

	public int inc() {
		return ++this.year;
	}

	@Override
	public String toString() {
		return "Student " + name + ", id: " + id;
	}
}