package Task2;

import java.io.*;
import java.util.*;

public class Course implements Serializable {
	private static final long serialVersionUID = 6529685098267757690L;
	private String courseTitle;
	private Textbook textbook;
	private Instructor instructor;

	public Course(String courseTitle, Instructor instructor, Textbook textbook) {
		this.courseTitle = courseTitle;
		this.textbook = textbook;
		this.instructor = instructor;
	}

	public void setcourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Course))
			return false;

		Course course = (Course) obj;
		return this.courseTitle.equals(course.courseTitle) && this.textbook.equals(course.textbook)
				&& this.instructor.equals(course.instructor);
	}

	public String toString() {
		return "\nCourse{" + "\nTittle: " + this.courseTitle + "\nBook" + textbook.toString() + "\nInstructor: "
				+ instructor.toString() + "\n}";
	}

}
