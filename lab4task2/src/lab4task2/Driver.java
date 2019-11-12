package lab4task2;

import java.io.*;
import java.util.*;

public class Driver implements Serializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Date date = new Date();
		Scanner scanner = new Scanner(System.in);
		mainMenu: while (true) {
			System.out.println("Welcome! \nWould you like to activate Admin mode or User mode ?");
			System.out.println("Press '1' to enter as admin");
			System.out.println("Press '2' to enter as user");
			int input = scanner.nextInt();
			if (input == 1) {
				while (true) {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					BufferedWriter bw = new BufferedWriter(
							new FileWriter("C:\\Users\\user\\Desktop\\admin.txt", true));
					System.out.printf("Please, enter the admin name: ");
					String login = br.readLine();
					System.out.printf("Please, enter the password: ");
					String password = br.readLine();
					int hashpass = Objects.hash(password);
					bw.newLine();
					bw.write("Username: " + login );
					bw.newLine();
					bw.write("Password: " + hashpass);
					bw.newLine();
					bw.write(date + " admin logged into a system");
					bw.flush();
					adminMode: while (true) {
						System.out.println("---------ADMIN MODE---------");
						System.out.println("Press '1' to add new Instructor");
						System.out.println("Press '2' to add new Textbook");
						System.out.println("Press '3' to add new Course");
						System.out.println("Press 4 to go back");
						int answer = scanner.nextInt();
						if (answer == 1) {
							System.out.println("Adding instructor..");
							System.out.println("Please, fill the following ...");
							scanner.nextLine();
							System.out.printf("Write name : ");
							String name = scanner.nextLine();
							System.out.printf("Write surname : ");
							String surname = scanner.nextLine();
							System.out.printf("Write deparment : ");
							String department = scanner.nextLine();
							System.out.printf("Write email : ");
							String email = scanner.nextLine();
							Instructor instructor = new Instructor(name, surname, department, email);
							ArrayList<Instructor> i = new ArrayList<Instructor>();
							i.add(instructor);
							ObjectOutputStream oos = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\instructor.txt"));
							oos.writeObject(i);
							oos.flush();
							oos.close();
							bw.newLine();
							bw.write(date + " admin added new instructor " + "\"" + name + " " + surname + "\"");
							bw.newLine();
							bw.flush();
							System.out.println("Instructor successfully added!");
						}
						if (answer == 2) {
							System.out.println("Adding textbook ..");
							ObjectOutputStream oost = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\book.txt"));
							System.out.println("Please, fill the following ...");
							scanner.nextLine();
							System.out.printf("Write title : ");
							String title = scanner.nextLine();
							System.out.printf("Write author : ");
							String author = scanner.nextLine();
							System.out.printf("Write isbn : ");
							int isbn = scanner.nextInt();
							Textbook textbook = new Textbook(isbn, title, author);
							ArrayList<Textbook> t = new ArrayList<Textbook>();
							t.add(textbook);
							oost.writeObject(t);
							bw.newLine();
							oost.flush();
							oost.close();
							bw.write(date + " admin added new Textbook " + "\"" + title + "\"");
							bw.flush();
							System.out.println("Textbook successfully added!");
						}
						if (answer == 3) {
							ObjectOutputStream ooss = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\course.txt"));
							System.out.println("Please, enter next fields : course title, Instructor, Textbook");
							scanner.nextLine();
							System.out.printf("Write course title: ");
							String courseTitle = scanner.nextLine();
							ObjectOutputStream oos1 = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\instructor.txt"));
							System.out.println("Please, fill the following fields in order to create a new instructor");
							System.out.printf("Write name: ");
							String name1 = scanner.next();
							System.out.printf("Write surname: ");
							String surname1 = scanner.next();
							System.out.printf("Write department: ");
							String department1 = scanner.next();
							System.out.printf("Write email:");
							String email1 = scanner.next();
							bw.newLine();
							bw.write(date + " admin added new instructor " + "\"" + name1 + " " + surname1 + "\"");
							bw.flush();
							bw.newLine();
							Instructor instructor1 = new Instructor(name1, surname1, department1, email1);
							ArrayList<Instructor> i1 = new ArrayList<Instructor>();
							i1.add(instructor1);
							oos1.writeObject(i1);
							oos1.flush();
							oos1.close();
							System.out.println("New Instructor added");
							ObjectOutputStream oos2 = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\book.txt"));
							System.out.println("Please, fill the following fields in order to create a new textbook");
							scanner.nextLine();
							System.out.printf("Write tittle: ");
							String title1 = scanner.next();
							System.out.printf("Write author: ");
							String author1 = scanner.next();
							scanner.nextLine();
							System.out.printf("Write isbn: ");
							int isbn1 = scanner.nextInt();
							bw.newLine();
							bw.write(date + " admin added new Textbook " + "\"" + title1 + "\"");
							bw.flush();
							bw.newLine();
							Textbook txtbook = new Textbook(isbn1, title1, author1);
							ArrayList<Textbook> t1 = new ArrayList<Textbook>();
							t1.add(txtbook);
							oos2.writeObject(t1);
							oos2.flush();
							oos2.close();
							System.out.println("New Textbook added");
							Course course = new Course(courseTitle, txtbook, instructor1);
							System.out.println("Course successfully added!");
							ArrayList<Course> c = new ArrayList<Course>();
							c.add(course);
							ooss.writeObject(c);
							ooss.flush();
							ooss.close();
							bw.newLine();
							bw.write(date + " admin added new Course " + "\"" + courseTitle + "\"");
							bw.newLine();
							bw.flush();
						}
						if (answer == 4)
							continue mainMenu;
					}

				}
			}
			if (input == 2) {
				while (true) {
					Iterator it;
					System.out.println("-----User Mode-----");
					System.out.println("\n1)View the list of available courses \n2)Display information about courses");
					int cnt = scanner.nextInt();
					if (cnt == 1) {
						System.out.println("------Courses------");
						ObjectInputStream ois = new ObjectInputStream(
								new FileInputStream("C:\\Users\\user\\Desktop\\course.txt"));
						ArrayList<Course> arr = new ArrayList<>();
						arr = (ArrayList) ois.readObject();
						it = arr.iterator();
						while (it.hasNext()) {
							System.out.println(it.next());
							ois.close();
						}

					}
					if (cnt == 2) {
						System.out.println("-----Information-----");
						ObjectInputStream ois1 = new ObjectInputStream(
								new FileInputStream("C:\\Users\\user\\Desktop\\course.txt"));
						ArrayList<Course> arr1 = new ArrayList<>();
						arr1 = (ArrayList) ois1.readObject();
						ois1.close();
						for (Course c : arr1) {
							System.out.println(c);
						}

					}
					if (cnt == 3) 
						continue mainMenu;

				}
			}
		}
	}
}
