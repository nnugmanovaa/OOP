package one;

import java.io.Serializable;
import java.util.Objects;

public class Course implements Serializable  {
	private String courseTitle;
	private Textbook textbook;
	private Instructor instructor;

	public Course(String courseTitle, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle;
		this.instructor = instructor;
		this.textbook = textbook;
	}

	public String getcourseTitle() {
		return courseTitle;
	}

	public void setcourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Course))
			return false;
		Course c = (Course) obj;
		return c.courseTitle.equals(c.courseTitle) && c.instructor.equals(c.instructor)
				&& c.textbook.equals(c.textbook);
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseTitle, textbook, instructor);
	}

	@Override
	public String toString() {
		return "Course Title " + this.courseTitle + "\nTextbook " + this.textbook;
	}

}
