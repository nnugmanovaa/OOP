package Task2;

import java.io.*;
import java.util.*;

/*public class Driver implements Serializable {/*
	// try
	// {
	public static void main(String [] args) throws IOException, ClassNotFoundException {
	Date date = new Date();
	Scanner scanner = new Scanner(System.in);
	Vector<Textbook> vec_book = new Vector<Textbook>();
	Vector<Instructor> vec_instructor = new Vector<Instructor>();
	Vector<Course> vec_course = new Vector<Course>();
	while(true)
	{
		System.out.println("Welcome! \nWould you like to activate Admin mode or User mode ?");
		System.out.println("Press '1' to enter as admin");
		System.out.println("Press '2' to enter as user");
		int input = scanner.nextInt();
		if (input == 1) {
			while (true) {
				FileWriter fw = new FileWriter("admin.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				System.out.println("Please, enter the admin name ...");
				String login = scanner.nextLine();
				System.out.println("Please, enter the password");
				String password = scanner.nextLine();
				int hashpass = Objects.hash(password);
				bw.write("Username: " + login);
				bw.write("Password: " + hashpass);
				bw.write(date + "admin logged into a system");
				while (true) {
					System.out.println("---------ADMIN MODE---------");
					System.out.println("Press '1' to add new Instructor");
					System.out.println("Press '2' to add new Textbook");
					System.out.println("Press '3' to add new Course");
					int answer = scanner.nextInt();
					if (answer == 1) {
						System.out.println("Adding instructor..");
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instrSer.out"));
						System.out.println("Please, fill the following ...");
						System.out.println("Write name : ");
						String name = scanner.nextLine();
						System.out.println("Write surname : ");
						String surname = scanner.nextLine();
						System.out.println("Write deparment : ");
						String department = scanner.nextLine();
						System.out.println("Write email : ");
						String email = scanner.nextLine();
						Instructor instructor = new Instructor(name, surname, department, email);
						vec_instructor.add(instructor);
						oos.writeObject(vec_instructor);
						bw.newLine();
						bw.write(date + "admin added new instrcutor " + "\"" + name + " " + surname + "\"");
						bw.newLine();
						oos.close();
						System.out.println("Instrcutor successfully added!");
					}
					if (answer == 2) {
						System.out.println("Adding textbook ..");
						ObjectOutputStream oost = new ObjectOutputStream(new FileOutputStream("bookSer.out"));
						System.out.println("Please, fill the following ...");
						System.out.println("\nWrite title : ");
						String title = scanner.nextLine();
						System.out.println("\nWrite author : ");
						String author = scanner.nextLine();
						System.out.println("\nWrite isbn : ");
						String isbn = scanner.nextLine();
						Textbook textbook = new Textbook(title, author, isbn);
						vec_book.add(textbook);
						oost.writeObject(vec_book);
						bw.newLine();
						oost.close();
						bw.write(date + "admin added new Textbook " + "\"" + title + "\"");
						System.out.println("Textbook successfully added!");
					}
					if (answer == 3) {
						/*ObjectOutputStream ooss = new ObjectOutputStream(new FileOutputStream("courseSer.out"));
						System.out.println("Please, enter next fields : course title, Instructor, Textbook");
						System.out.println("\nWrite course title: ");
						String courseTitle = scanner.nextLine();
						ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("instrSer.out"));
						System.out.println("Please, fill the following fields in order to create a new instructor");
						System.out.print("\nWrite name: ");
						String name1 = scanner.next();
						System.out.print("\nWrite surname: ");
						String surname1 = scanner.next();
						System.out.print("\nWrite department: ");
						String department1 = scanner.next();
						System.out.print("\nWrite email:");
						String email1 = scanner.next();
						bw.newLine();
						bw.write(date + "admin added new instructor " + "\"" + name1 + " " + surname1 + "\"");
						bw.newLine();
						Instructor instructor1 = new Instructor(name1, surname1, department1, email1);
						vec_instructor.add(instructor1);
						oos1.writeObject(vec_instructor);
						oos1.close();
						System.out.println("New Instructor added");
						ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("bookSer.out"));
						System.out.println("Please, fill the following fields in order to create a new textbook");
						System.out.print("\nWrite tittle: ");
						String title1 = scanner.next();
						System.out.print("\nWrite author: ");
						String author1 = scanner.next();
						System.out.print("\nWrite isbn: ");
						String isbn1 = scanner.next();
						bw.newLine();
						bw.write(date + "admin added new Textbook " + "\"" + title1 + "\"");
						bw.newLine();
						Textbook txtbook = new Textbook(title1, author1, isbn1);
						vec_book.add(txtbook);
						oos2.writeObject(vec_book);
						oos2.close();
						System.out.println("New Textbook added");
						Course course = new Course(courseTitle, instructor1, txtbook);
						System.out.println("Course successfully added!");
						vec_course.add(course);
						ooss.writeObject(vec_course);
						ooss.close();
						bw.newLine();
						bw.write(date + "admin added new Course " + "\"" + courseTitle + "\"");
						bw.newLine();
					}
				}

			}*/
						/*ObjectOutputStream oisc = new ObjectOutputStream(new FileOutputStream("courseSer.out"));

                        System.out.println("Please fill next fields: courseName , Instructor ,Textbook");
                        String nameCourse = scanner.next();
                        System.out.println("If you want to add new Instructor press '1' or press '2' to choose from existing");
                        int choiceneworold =scanner.nextInt();
                        if(choiceneworold==1){
                            ObjectOutputStream oosi1 = new ObjectOutputStream(new FileOutputStream("instrSer.out"));
                            System.out.println("Please fill next fields: ");
                            System.out.print("Write name: ");
                            String name1 = scanner.next();
                            System.out.println();
                            System.out.print("Write surname: ");
                            String surname1 =scanner.next();
                            System.out.println();
                            System.out.print("Write department: ");
                            String department1 = scanner.next();
                            System.out.println();
                            System.out.print("Write email:");
                            String email1 = scanner.next();
                            bw.newLine(); 
                            bw.write(date+" admin add new instructor "+"\""+name1+" "+surname1+"\"");
                            bw.newLine();
                            Instructor instructor1 = new Instructor(name1,surname1,department1,email1);
                            vec_instructor.add(instructor1);
                            oosi1.writeObject(vec_instructor);
                            oosi1.close();
                            System.out.println("New instructor added");
                        }
                        else if(choiceneworold==2){
                            ObjectInputStream oisi2 = new ObjectInputStream(new FileInputStream("instrSer.out"));
                            Vector<Instructor> inst = (Vector<Instructor>)oisi2.readObject();
                            System.out.println("Choose the instructor: ");
                            for(int i = 0; i < inst.size(); i++) {
                                System.out.println(i+1 + ") " + inst.get(i).toString());
                            }
                            int  instrucot_choose = scanner.nextInt();
                            Instructor instructor1 = new Instructor(inst.get(instrucot_choose-1).getFirstName(),inst.get(instrucot_choose-1).getLastName(),inst.get(instrucot_choose-1).getDepartment(),inst.get(instrucot_choose-1).getEmail());
                            oisi2.close();
                            System.out.println("Existing instructor choosen ");

                        }
                        System.out.println("If you want to add new textbook press '1' else press '2' to choice from existing textbooks");
                        choiceneworold = scanner.nextInt();
                        if(choiceneworold==1){
                            ObjectOutputStream oost1 = new ObjectOutputStream(new FileOutputStream("bookSer.out"));
                            System.out.println("Please fill next fields: ");
                            System.out.print("Write tittle: ");
                            String title1 = scanner.next();
                            System.out.println();
                            System.out.print("Write author: ");
                            String author1 = scanner.next();
                            System.out.println();
                            System.out.print("Write isbn: ");
                            String isbn1 = scanner.nextLine();
                            bw.newLine();
                            bw.write(date+" admin add new Textbook "+"\""+title1+"\"");
                            bw.newLine();
                            Textbook book1  = new Textbook(isbn1,title1,author1);
                            vec_book.add(book1);
                            oost1.writeObject(vec_book);
                            oost1.close();
                            System.out.println("New book added");
                        }
                        else if(choiceneworold==2){
                            ObjectInputStream oist = new ObjectInputStream(new FileInputStream("bookSer.out"));
                            Vector<Textbook> inst = (Vector<Textbook>)oist.readObject();
                            System.out.println("Choose the Textbook: ");
                            for(int i = 0; i < inst.size(); i++) {
                                System.out.println(i+1 + ") " + inst.get(i).toString());
                            }
                            int choosen_book = scanner.nextInt();
                            Textbook book1 = new Textbook(inst.get(choosen_book-1).getISBN(),inst.get(choosen_book-1).getTitle(),inst.get(choosen_book-1).getAuthor());
                            oist.close();
                            System.out.println("Existing book choosen");

                        }
                        System.out.println("Course added!!!");
                        Course course = new Course(nameCourse, instructor1, book1);
                        vec_course.add(course);
                        oisc.writeObject(vec_course);
                        oisc.close();
                        date = new Date();
                        bw.newLine();
                        bw.write(date+" admin add new Course "+"\""+nameCourse+"\"");
                        bw.newLine();
                }
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
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("courseSer.out"));
					System.out.println("------Courses------");
					Vector<Course> vctcr = (Vector<Course>) ois.readObject();
					it = vctcr.iterator();
					while (it.hasNext()) {
						System.out.println(it.next());
					}
					ois.close();
				}
				if (cnt == 2) {
					ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("courseSer.out"));
					Vector<Course> vctcr1 = (Vector<Course>) ois1.readObject();
					for (Course c : vctcr1) {
						System.out.println(vctcr1);
					}
					ois1.close();
				}

			}
		}
	}
	}
}*/
	// }catch(FileNotFoundException ex) {
	// ex.printStackTrace();
	// }catch(IOException e) {
	// e.printStackTrace();
	// }catch (ClassNotFoundException e1) {
	// e1.printStackTrace();

//}
