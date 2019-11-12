package Task3;

import java.util.Comparator;

public class DateComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee a , Employee b) {
		return a.gethireDate().compareTo(b.gethireDate());
	}
}
