
public class OperatorsArithmetic {
	public static double celsius2Fahrenheit(double celsius) {
		double fahrenheit = 9.0/5 * celsius + 32;
		return fahrenheit;
		
	}
	
	public static void main(String[] args) {
		double tempF = celsius2Fahrenheit(26.0);
		System.out.println("Die heutige Temperatur ist in Fahrenheit: "+tempF);
		/*
		// Übung 1
		
		int a = 15;
		int b = 10;
		int ergebnis = 0;

		ergebnis = a + b;
		System.out.println(a + " + " + b + " = " + ergebnis);
		// System.out.println(a+" + "+b+" = "+ (a+b));
		ergebnis = a - b;
		System.out.println(a + " - " + b + " = " + ergebnis);
		ergebnis = a * b;
		System.out.println(a + " * " + b + " = " + ergebnis);
		ergebnis = a / b;
		System.out.println(a + " / " + b + " = " + ergebnis);
		ergebnis = a % b;
		System.out.println(a + " % " + b + " = " + ergebnis);
		 	*/	
	}
	
	
	

}
