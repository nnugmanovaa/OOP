package task3;

import java.util.Objects;

public class Employee extends Person {
	protected double salary;
	protected int year;
	protected String insuranceNumber;

	public Employee(String name, double salary, int year, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee emp = (Employee) obj;
		return this.salary == (emp.salary) && this.year == (emp.year) && this.insuranceNumber == (emp.insuranceNumber);
	}

	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(year, salary, insuranceNumber);
	}

	@Override
	public String toString() {
		return super.toString() + " , salary is " + this.salary + " , insurance Number is " + this.insuranceNumber;
	}

}
