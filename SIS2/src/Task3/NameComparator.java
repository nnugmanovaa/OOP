package Task3;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee a , Employee b) {
		return a.name.compareTo(b.name);
	}
}
