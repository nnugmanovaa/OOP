package Task3;

import java.util.*;

public class Manager extends Employee implements Comparable, Cloneable {
	public Vector<Employee> employees;
	private double bonus;

	public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
		super(name, salary, hireDate, insuranceNumber);
		employees = new Vector<Employee>();
		this.bonus = bonus;
	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public double getBonus(double bonus) {
		this.bonus = bonus;
		return bonus;
	}

	@Override
	public Manager clone() throws CloneNotSupportedException {
		Manager newManager = (Manager) super.clone();
		newManager.employees = (Vector) employees.clone();
		return newManager;
	}

	@Override
	public int compareTo(Object obj) {
		Manager othermanager = (Manager) obj;
		return this.name.compareTo(othermanager.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Manager))
			return false;
		Manager mn = (Manager) obj;
		return this.employees.equals(mn.employees) && this.bonus == mn.bonus;
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
