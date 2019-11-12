package task3;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee("Madina", 3000, 2019,"123601");
		Employee e2 = new Employee("Madina", 3000, 2019,"123601");
		Employee e3 = new Employee("Krestina", 2000, 2020,"123602");
		hs.add(e3);
		hs.add(e2);
		hs.add(e1);
		
		System.out.println(hs);
	}

}
