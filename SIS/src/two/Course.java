package two;

import java.util.ArrayList;

public class Course {
	private String name;;
	private String description;
	private int credits;
	private ArrayList<Course> prerequisites;

	{
		prerequisites = new ArrayList<>();
	}

	public Course(String name, String description, int credits) {
		this.name = name;
		this.credits = credits;
		this.description = description;
	}

	@Override
	public String toString() {
		return this.name +" " + this.description;
	}
}
