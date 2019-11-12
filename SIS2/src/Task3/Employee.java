package Task3;

import java.lang.*;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable,Cloneable {

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
	
	public Date gethireDate() {
		return hireDate;
	}

	@Override
	public Employee clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		cloned.hireDate = (Date) hireDate.clone();
		return cloned;
	}
	
	@Override
	public int compareTo(Object obj) {
		Employee employee = (Employee)obj;
		return this.hireDate.compareTo(employee.hireDate);
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
