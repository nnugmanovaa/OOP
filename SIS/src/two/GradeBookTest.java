package two;

import java.util.Scanner;
import one.Student;

public class GradeBookTest {

	GradeBook gradebook;

	public GradeBookTest(GradeBook gradebook) {
		this.gradebook = gradebook;
	}

	public void gradeBT() {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		System.out.println(gradebook.displayMessage());
		for (Student s : gradebook.getStudents()) {
			System.out.println("Student " + s.getName() + ": ");
			temp = sc.nextInt();
			gradebook.addGrade(temp);
		}
	}

	public static void main(String[] args) {
		GradeBook gradebook = new GradeBook(new Course("CS101", "Object-oriented Programming\r\n" + "and Design", 3));
		gradebook.createStudents();
		GradeBookTest gradebooktest = new GradeBookTest(gradebook);
		gradebooktest.gradeBT();
		gradebook.displayGradeReport();

	}

}
