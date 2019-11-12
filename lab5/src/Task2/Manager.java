package Task2;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
	Vector<Employee> employees;
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
	public int compareTo(Object obj) {
		Manager othermanager = (Manager) obj;
		if (this.getSalary() > othermanager.getSalary()) {
			return 1;
		} else if (this.getSalary() == othermanager.getSalary()) {
			if (this.bonus > othermanager.bonus) {
				return 1;
			} else if (this.bonus < othermanager.bonus) {
				return -1;
			} else
				return 0;
		} else
			return -1;
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
