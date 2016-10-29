
public class uebung1 extends HelloGitHub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = printRectangleArea("Die Fläche ist: ", 3, 4);
		System.out.println(result);
		
		double tempF = celsius2Fahrenheit(26.0);
		System.out.println("Fahrenheit: "+tempF);
		double tempC = fahrenheit2Celsius(72.5);
		System.out.println("Celsius: "+tempC);
		System.out.println("Celsius: "+tempC);
		System.out.println("Celsius: "+tempC);

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
