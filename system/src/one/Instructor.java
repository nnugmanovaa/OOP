package one;

import java.io.Serializable;
import java.util.Objects;

public class Instructor implements Serializable  {
	private String name;
	private String surname;
	private String department;
	private String email;

	public Instructor(String name, String surname, String department, String email) {
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Instructor))
			return false;
		Instructor inst = (Instructor) obj;
		return this.name.equals(inst.name) && this.surname.equals(inst.surname)
				&& this.department.equals(inst.department) && this.email.equals(inst.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname, department, email);
	}

	@Override
	public String toString() {
		return "Instructor \nname: " + this.name + "\nsurname: " + this.surname + "\ndepartment:" + this.department
				+ "\nemail: " + this.email;
	}

}
