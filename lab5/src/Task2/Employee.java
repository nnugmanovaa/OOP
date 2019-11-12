package Task2;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable {

	private double salary;
	private Date hireDate;
	private String insuranceNumber;

	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Object obj) {
		Employee empl = (Employee) obj;
		if (this.salary > empl.salary)
			return 1;
		if (this.salary < empl.salary)
			return -1;
		else
			return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee emp = (Employee) obj;
		return this.salary == (emp.salary) && this.insuranceNumber == (emp.insuranceNumber);
	}

	@Override
	public String toString() {
		return super.toString() + " , salary is " + this.salary + " , insurance Number is " + this.insuranceNumber
				+ " hireDate is " + this.hireDate;
	}

}
