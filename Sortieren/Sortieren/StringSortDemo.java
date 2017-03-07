package Sortieren;

import java.util.Arrays;

public class StringSortDemo {
	public static void main(String[] args) {
		String[] names = {"Elisabeth", "Stefan", "Max", "Viktoria"};
		// Ausgabe der unsortierten Liste
		System.out.println(Arrays.toString(names));
		// Sortieren
		Arrays.sort(names);
		//Ausgabe der sortierten Liste
		System.out.println(Arrays.toString(names));
		
	}

}
