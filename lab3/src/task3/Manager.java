package task3;

import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
	Vector<Employee> employees;
	protected double bonus;

	public Manager(String name, double salary, int year, String insuranceNumber) {
		super(name, salary, year, insuranceNumber);
		employees = new Vector<Employee>();
		this.bonus = 0;
	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public void getBonus(double bonus) {
		this.bonus = bonus;
		this.salary += this.salary * this.bonus;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Manager))
			return false;
		Manager mn = (Manager) obj;
		return this.employees.equals(mn.employees);
	}

	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(employees);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
