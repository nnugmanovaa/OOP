package three;

import java.util.Vector;

public class DragonLaunch {
	Vector<Person> v;

	public DragonLaunch() {
		v = new Vector<Person>();
	}

	public void kidnap(Person p) {
		v.add(p);
	}

	public boolean willDragonEatOrNot() {
		int cnt = 0;
		for (Person p : v) {
			if (p.gender == Gender.GIRL)
				cnt--;
			else
				cnt++;
			if (cnt < 0)
				return true;
		}
		if (cnt == 0)
			return false;
		else
			return true;

	}

}
