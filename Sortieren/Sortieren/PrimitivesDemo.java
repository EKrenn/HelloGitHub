package Sortieren;

import java.util.Arrays;

public class PrimitivesDemo {

	public static void main(String[] args) {
		char[] myChars = {'a', 'D', 'x', 'R'};
		//Sortierung: Groﬂbuchstaben immer vor Kleinbuchstaben
		Arrays.sort(myChars);
		// Array muss mit .toString ausgegeben werden, sonst: keine Ausgabe
		System.out.println(Arrays.toString(myChars));
		
		for (char c : myChars) {
			System.out.println(c);
		}
		
		int[] myInts = {-1000, 50, 4, 500};
		Arrays.sort(myInts);
		// Array muss mit .toString ausgegeben werden, sonst: keine Ausgabe
		System.out.println(Arrays.toString(myInts));
		
		
		

	}

}
