package one;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Controller implements Serializable {
	private Textbook textbook;
	private Instructor instructor;
	private Course course;

	public static ArrayList<Textbook> txtarray = new ArrayList();
	public static ArrayList<Instructor> instarray = new ArrayList();
	public static ArrayList<Course> carray = new ArrayList();
	public static ArrayList<String> courseTitle = new ArrayList();

	public void begin() throws IOException, ClassNotFoundException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\1\\adminlog.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\1\\userlog.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\1\\admin.txt", true));
		SimpleDateFormat simpledate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Welcome to Nargiza`s intranet system! \n");
		// System.out.println("Would you like to enter as user or admin ?");
		mainMenu: while (true) {
			System.out.println("Would you like to enter as user or admin ?");
			String ans = br.readLine();
			if (!(ans.equals("user") || ans.equals("admin"))) {
				System.out.println("Invalid");
				break;
			}
			if (ans.equals("admin")) {
				System.out.println("Please, enter the login...");
				String login = br.readLine();
				System.out.println("Please, enter the password...");
				String password = br.readLine();
				String firstLine = br1.readLine().split(" ")[1];
				String secondLine = br1.readLine().split(" ")[1];
				if (login.equals(firstLine) && password.equals(secondLine)) {
					bw.write(simpledate.format(new Date()) + " Admin " + login + " logged into a system");
					bw.newLine();
					bw.flush();
					System.out.println("You successfully entered to ADMIN mode !");
					menu: while (true) {
						System.out.println("Press 1 to add new Course");
						System.out.println("Press 2 to add new Instructor");
						System.out.println("Press 3 to add new Textbook");
						System.out.println("Press 4 to go back");
						String a = br.readLine();
						switch (a) {
						case "3":
							System.out.println("Please, enter Textbook`s title ...");
							String stitle = br.readLine();
							System.out.println("Please, enter Textbook`s autor ...");
							String sauthor = br.readLine();
							System.out.println("Please, enter Textbook`s isbn ...");
							String sisbn = br.readLine();
							textbook = new Textbook(sisbn, stitle, sauthor);
							txtarray.add(textbook);
							ObjectOutputStream oos = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\1\\textbook.txt"));
							oos.writeObject(txtarray);
							oos.flush();
							oos.close();
							bw.write(simpledate.format(new Date()) + login + "added Textbook " + stitle);
							bw.newLine();
							bw.flush();
							System.out.println("Textbook " + stitle + " successfully added !\n");
							continue menu;

						case "2":
							System.out.println("Please, enter Instructor`s name ...");
							String iname = br.readLine();
							System.out.println("Please, enter Instructor`s surname ...");
							String isurname = br.readLine();
							System.out.println("Please, enter Instructor`s department ...");
							String idepartment = br.readLine();
							System.out.println("Please, enter Instructor`s email ...");
							String iemail = br.readLine();
							instructor = new Instructor(iname, isurname, idepartment, iemail);
							instarray.add(instructor);
							ObjectOutputStream oosss = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\1\\instructor.txt"));
							oosss.writeObject(instarray);
							oosss.flush();
							oosss.close();
							bw.write(simpledate.format(new Date()) + " "+ login + " added Instructor " + iname + " "
									+ isurname);
							bw.newLine();
							bw.flush();
							System.out.println("Instructor " + iname + " " + isurname + " successfully added !\n");
							continue menu;

						case "1":
							System.out.println("Please, enter the course title ...");
							String cctitle = br.readLine();
							courseTitle.add(cctitle);
							ObjectOutputStream ooss1 = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\1\\courseTitle.txt"));
							ooss1.writeObject(courseTitle);
							ooss1.flush();
							ooss1.close();
							System.out.println("Please, enter Textbook`s title ...");
							String ctitle = br.readLine();
							System.out.println("Please, enter Textbook`s autor ...");
							String cauthor = br.readLine();
							System.out.println("Please, enter Textbook`s isbn ...");
							String cisbn = br.readLine();
							textbook = new Textbook(cisbn, ctitle, cauthor);
							txtarray.add(textbook);
							System.out.println("Please, enter Instructor`s name ...");
							String cname = br.readLine();
							System.out.println("Please, enter Instructor`s surname ...");
							String csurname = br.readLine();
							System.out.println("Please, enter Instructor`s department ...");
							String cdepartment = br.readLine();
							System.out.println("Please, enter Instructor`s email ...");
							String cemail = br.readLine();
							instructor = new Instructor(cname, csurname, cdepartment, cemail);
							instarray.add(instructor);
							course = new Course(cctitle, textbook, instructor);
							carray.add(course);
							ObjectOutputStream ooss = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\1\\textbook.txt"));
							ooss.writeObject(txtarray);
							ooss.flush();
							ooss.close();
							ObjectOutputStream oos1 = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\1\\instructor.txt"));
							oos1.writeObject(instarray);
							oos1.flush();
							oos1.close();
							ObjectOutputStream oos2 = new ObjectOutputStream(
									new FileOutputStream("C:\\Users\\user\\Desktop\\1\\course.txt"));
							oos2.writeObject(carray);
							oos2.flush();
							oos2.close();
							bw.write(simpledate.format(new Date()) + login + "added Course " + cctitle);
							bw.newLine();
							bw.flush();
							bw.write(simpledate.format(new Date()) + login + "added Textbook " + ctitle);
							bw.newLine();
							bw.flush();
							bw.write(simpledate.format(new Date()) + login + "added Instructor " + cname + " "
									+ csurname);
							bw.newLine();
							bw.flush();
							System.out.println("Course " + cctitle + " successfully added !\n");
							continue menu;
						case "4":
							continue mainMenu;
						// bw.flush();
						// bw.close();
						// br.close();
						}
					}
				} else
					System.out.println("Wrong login or password !");
			}
			if (ans.equals("user")) {
				System.out.println("Please, enter the login...");
				String ulogin = br.readLine();
				System.out.println("Please, enter the password...");
				String upassword = br.readLine();
				String ufirstLine = br2.readLine().split(" ")[1];
				String usecondLine = br2.readLine().split(" ")[1];
				if (ulogin.equals(ufirstLine) && upassword.equals(usecondLine)) {
					System.out.println("You successfully entered to USER mode !");
					bw.write(simpledate.format(new Date()) + " User " + ulogin + " logged into a system");
					bw.newLine();
					bw.flush();
					Umenu: while (true) {

						System.out.println("Press 1 to view list of available course...");
						System.out.println("Press 2 to display information about the course...");
						System.out.println("Press 3 to return back to main menu ...");
						String b = br.readLine();
						switch (b) {
						case "1":
							ObjectInputStream ois = new ObjectInputStream(
									new FileInputStream("C:\\Users\\user\\Desktop\\1\\courseTitle.txt"));
							ArrayList<String> coursetitlearr = (ArrayList<String>) ois.readObject();
							ois.close();
							Iterator it = coursetitlearr.iterator();
							while (it.hasNext()) {
								System.out.println(it.next());
							}
							continue Umenu;

						case "2":
							ObjectInputStream ois1 = new ObjectInputStream(
									new FileInputStream("C:\\Users\\user\\Desktop\\1\\course.txt"));
							ArrayList<Course> coursearr = (ArrayList<Course>) ois1.readObject();
							int cnt = 1;
							System.out.println("Info about courses : ");
							for (Course c : coursearr)
								System.out.println(c.toString());
							ois1.close();
							continue Umenu;

						case "3":
							continue mainMenu;
						}
					}
				}

			} else
				System.out.println("Wrong login or password !");
		}
	}
}
