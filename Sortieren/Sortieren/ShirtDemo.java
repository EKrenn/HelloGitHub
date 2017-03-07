package Sortieren;

import java.util.Arrays;

public class ShirtDemo {

	public static void main(String[] args) {
		Shirt[] array = {new Shirt("blue", 32), new Shirt("green", 45)};
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));

	}

}
