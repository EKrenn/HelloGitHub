package Personalverwaltung;

import java.util.Arrays;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee[] array = {new Employee(232, "Chris", 20000, "IT"), 
				new Employee(12, "Elisabeth", 3908, "HR"),
				new Employee(456, "Viki", 98000, "IT"),
				new Employee(100, "Zlatko", 8000, "QM")};
		
		
		
		Arrays.sort(array);
		
		// Ausgabe 1:
		//System.out.println(Arrays.toString(array));
		
		// Ausgabe 2:
		for (Employee employee : array) {
			System.out.println(employee);
		}
	}

}


