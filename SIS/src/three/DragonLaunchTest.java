package three;

public class DragonLaunchTest {

	public static void main(String[] args) {
		DragonLaunch dl = new DragonLaunch();
		Person p = new Person("Askar", Gender.BOY);
		Person p1 = new Person("Madina", Gender.GIRL);
		Person p2 = new Person("Krestina", Gender.GIRL);
		Person p3 = new Person("Adil", Gender.BOY);
		dl.kidnap(p);
		dl.kidnap(p3);
		dl.kidnap(p1);
		dl.kidnap(p2);
		if (dl.willDragonEatOrNot())
			System.out.println("Dragon will have lunch");
		else
			System.out.println("Dragon will not have lunch");

	}

}
