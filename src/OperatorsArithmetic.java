
public class OperatorsArithmetic {
	
	
	public static void main(String[] args) {
		double tempF = celsius2Fahrenheit(26.0);
		System.out.println("Die heutige Temperatur ist in Fahrenheit: "+tempF);
		
		String result = printRectangleArea("Die FlÃ¤che ist: ", 3, 4);
		System.out.println(result);
		
		double tempF = celsius2Fahrenheit(26.0);
		System.out.println("Fahrenheit: "+tempF);
		double tempC = fahrenheit2Celsius(72.5);
		System.out.println("Celsius: "+tempC);
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
	
	
	public static String printRectangleArea(String text, int a, int b)
	{
		int ergebnis = a*b;
		return text+" "+ergebnis; 
	}
	public static double celsius2Fahrenheit(double celsius)
	{
		double fahrenheit = (9.0/5) * celsius + 32;
		return fahrenheit;
	}
	public static double fahrenheit2Celsius(double fahrenheit)
	{
		double celsius = (fahrenheit - 32) / (9.0/5);
		return celsius;
	}
	
	

}
