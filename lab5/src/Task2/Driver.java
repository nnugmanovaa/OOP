package Task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class Driver {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

		Date one = date.parse("2001-11-24");
		Date two = date.parse("1997-04-06");

		Date three = date.parse("2001-11-17");
		Date four = date.parse("2000-03-30");

		Employee empl1 = new Employee("Alim", 800, three, "12345");
		Employee empl2 = new Employee("Izel", 900, four, "457346");

		System.out.println(empl1.equals(empl2));
		System.out.println(empl1.toString());
		System.out.println(empl2.toString());

		Manager mn1 = new Manager("Nargiza", 1800, one, "123601", 560);
		Manager mn2 = new Manager("Daniyar", 1800, two, "123621", 360);
		
		mn1.addEmployee(empl1);
		mn1.addEmployee(empl2);
		
		System.out.println(mn1.equals(mn2));
		System.out.println(mn1.compareTo(mn2));
		System.out.println(mn2.toString());
		System.out.println(mn1.toString());
	}

}
