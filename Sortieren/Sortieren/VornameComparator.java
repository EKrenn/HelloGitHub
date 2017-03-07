package Sortieren;

import java.util.Comparator;

public class VornameComparator implements Comparator<Person>{

	@Override
	public int compare(Person arg0, Person arg1) {
		return arg0.getVorname().compareTo(arg1.getVorname());
	}

}
