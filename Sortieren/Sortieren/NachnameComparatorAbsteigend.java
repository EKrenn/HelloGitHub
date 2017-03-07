package Sortieren;

import java.util.Comparator;

public class NachnameComparatorAbsteigend  implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// Bei Absteigend nach Nachnamen
		return o2.getNachname().compareTo(o1.getNachname());
	}
	
	

}
