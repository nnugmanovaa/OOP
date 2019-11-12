package lab4task2;

import java.io.Serializable;

public class Instructor implements Serializable {

	private String firstName;
	private String lastName;
	private String department;
	private String email;

	public Instructor(String firstName, String lastName, String department, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Textbook)) {
			return false;
		}
		Instructor instructor = (Instructor) o;

		return instructor.firstName.equals(firstName) && instructor.lastName.equals(lastName)
				&& instructor.department.equals(department) && instructor.email.equals(email);
	}

	public int hashCode() {
		int res = 8;
		res = 31 * res + firstName.hashCode();
		res = 31 * res + lastName.hashCode();
		res = 31 * res + department.hashCode();
		res = 31 * res + email.hashCode();
		return res;
	}

	public String toString() {
		return "FirstName: " + firstName + "\n" + "Lastname: " + lastName + "\n" + "Department: " + department + "\n"
				+ "Email: " + email;
	}

}
