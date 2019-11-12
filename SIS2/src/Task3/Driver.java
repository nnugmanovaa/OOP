package Task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Driver {
	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		ArrayList<Employee> ar = new ArrayList<Employee>();

		Date one = date.parse("2001-11-24");
		Date two = date.parse("1997-04-06");

		Date three = date.parse("2001-11-17");
		Date four = date.parse("2000-03-30");

		Employee empl1 = new Employee("Alim", 800, three, "12345");
		Employee empl2 = new Employee("Izel", 900, four, "457346");

		Manager mn1 = new Manager("Nargiza", 1800, one, "123601", 560);
		Manager mn2 = new Manager("Daniyar", 1800, two, "123621", 360);
		Manager clonee = mn1.clone();
		clonee.setName("Dauren");
		clonee.setSalary(1900);
		// System.out.println(mn1.toString() + '\n');
		// System.out.println(clonee.toString());
		// System.out.println(mn2.compareTo(clonee));
		// System.out.println(mn2.compareTo(clonee));

		ar.add(empl1);
		ar.add(empl2);
		ar.add(mn2);
		ar.add(mn1);

		System.out.println("Unsorted:");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i).name);

		Collections.sort(ar, new NameComparator());
		System.out.println("\nSorted by name");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i).name);

		System.out.println("\nSorted by hire date  : ");
		Collections.sort(ar, new DateComparator());
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i).name + " " + ar.get(i).gethireDate());
	}
}
