package four;

public class Driver {
	public static void main(String[] args) {

		Time t = new Time(23, 5, 6);
		Time t2 = new Time(4, 24, 33);
		System.out.println(t.toUniversal());
		System.out.println(t2.toUniversal());
		Time.addTime(t, t2);
		System.out.println(t.toUniversal());
	}
}
