package lab4task2;

import java.io.Serializable;

public class Course implements Serializable {

	private String courseTitle;
	private Textbook textbook;
	private Instructor instructor;

	public Course(String courseTitle, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle;
		this.textbook = textbook;
		this.instructor = instructor;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
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

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Textbook)) {
			return false;
		}
		Course course = (Course) o;

		return course.courseTitle.equals(courseTitle) && course.instructor.equals(instructor)
				&& course.textbook.equals(textbook);
	}

	public int hashcode() {
		int res = 7;
		res = 18 * res + courseTitle.hashCode();
		res = 18 * res + instructor.hashCode();
		res = 18 * res + textbook.hashCode();
		return res;
	}

	public String toString() {
		return courseTitle + " " + textbook.getAuthor() + " " + instructor.getFirstName() + " "
				+ instructor.getLastName();
	}

}
