package Task2;

import java.io.*;
import java.io.Serializable;
import java.util.Vector;

public class Instructor implements Serializable {
	private static final long serialVersionUID = 6529685098267757690L;
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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Instructor))
			return false;
		Instructor inst = (Instructor) obj;
		return this.firstName.equals(inst.firstName) && this.lastName.equals(inst.lastName)
				&& this.department.equals(inst.department) && this.email.equals(inst.department);
	}

	public String toString() {
		return "Instructor: Name:" + this.firstName + "  Surname:" + this.lastName + "  Department:" + this.department
				+ "  email:" + this.email;
	}

}
