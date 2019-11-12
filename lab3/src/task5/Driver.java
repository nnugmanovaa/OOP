package task5;

import java.util.Scanner;
import java.util.Vector;

public class Driver {
	Vector<Person> v;

	{
		v = new Vector<Person>();
	}

	public void Add(Person p) {
		v.add(p);

	}

	public void DisplayInfo() {
		for (Person p : v) {
			System.out.println(p);
		}
	}

	/*
	 * public void Do() { String s, s1, name, address, program, school; int year;
	 * double fee, pay; Scanner sc = new Scanner(System.in);
	 * System.out.println("Do you want to print info or add person ?"); s =
	 * sc.nextLine(); if (s.equals("print")) DisplayInfo(); if (s.equals("add")) {
	 * System.out.println("Do you want to add Person, Student or Staff ?"); s1 =
	 * sc.nextLine(); if (s.equals("Student")) {
	 * System.out.println("Please, enter the name.. "); name = sc.nextLine();
	 * System.out.println("Please, enter the address.. "); address = sc.nextLine();
	 * System.out.println("Please, enter the program..  "); program = sc.nextLine();
	 * System.out.println("Please, enter the year.. "); year = sc.nextInt();
	 * System.out.println("Please, enter the fee.. "); fee = sc.nextDouble(); Person
	 * pr = new Student(name, address, program, year, fee); Add(pr);
	 * System.out.println("Student sucсessfully added"); } else if
	 * (s1.equals("Person")) { System.out.println("Please, enter the name.. "); name
	 * = sc.nextLine(); System.out.println("Please, enter the address.. "); address
	 * = sc.nextLine(); Person pp = new Person(name, address); Add(pp);
	 * System.out.println("Person sucсessfully added"); } else if
	 * (s1.equals("Staff")) { System.out.println("Please, enter the name.. "); name
	 * = sc.nextLine(); System.out.println("Please, enter the address.. "); address
	 * = sc.nextLine(); System.out.println("Please, enter the school.. "); school =
	 * sc.nextLine(); System.out.println("Please, enter the pay.. "); pay =
	 * sc.nextDouble(); Person ppr = new Staff(name, address, school, pay);
	 * Add(ppr); System.out.println("Staff sucсessfully added"); } } }
	 */

	public static void main(String[] args) {
		Driver dr = new Driver();
		// dr.Do();

		Person p = new Person("Madina", "Turgut Ozala 70");
		Person p1 = new Student("Krestina", "Kramskoi 14", "AAA", 2018, 2000);
		Person p2 = new Staff("Danial", "ToleBi 59", "STG", 5000);
		dr.Add(p);
		dr.Add(p1);
		dr.Add(p2);
		dr.DisplayInfo();

	}

}
