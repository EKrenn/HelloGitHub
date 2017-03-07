package Sortieren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonDemo {

	public static void main(String[] args) {
		Person[] persons = {new Person(4321, "Elisabeth", "Krenn"), new Person(3456, "Susi", "Sorglos")};
		
		Arrays.sort(persons);
		System.out.println(Arrays.toString(persons));
		
		// ODER:
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
		List<Person> p = new ArrayList<>();
		p.add(new Person(234, "Elisabeth", "Maier"));
		p.add(new Person(67, "Susi", "Maier"));
		p.add(new Person(323, "Max", "Mustermann"));
		
		Collections.sort(p);
		System.out.println("---- Ausgabe der Liste sortiert nach ID ----");
		for (Person person : p) {
			System.out.println(person);
			
		}
		System.out.println();
		System.out.println("---- Ausgabe der Liste sortiert nach ID absteigend mit Comparator ----");
		Collections.sort(p, new IdComparatorAbsteigend());
		System.out.println(p);
		
		System.out.println();
		System.out.println("---- Ausgabe der Liste sortiert nach ID aufsteigend mit Comparator ----");
		Collections.sort(p, new IdComparatorAufsteigend());
		System.out.println(p);
		
		
		System.out.println();
		System.out.println("---- Ausgabe der Liste sortiert nach Vorname mit Comparator ----");
		Collections.sort(p, new VornameComparator());
		System.out.println(p);
		
		System.out.println();
		System.out.println("---- Ausgabe der Liste sortiert nach Nachname absteigend mit Comparator ----");
		Collections.sort(p, new NachnameComparatorAbsteigend());
		System.out.println(p);
		

	}

}
