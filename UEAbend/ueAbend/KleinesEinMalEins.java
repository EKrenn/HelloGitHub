package ueAbend;

public class KleinesEinMalEins {

	public static void main(String[] args) {
		//berechnung();
		berechnungArray();
		

	}
	
	public static int[] berechnungArray()
	{
		int[] array1  = new int[11];
		for(int eingabe = 1; eingabe <= 10; eingabe ++)
		{
			for(int multiplikator = 1; multiplikator <= 10; multiplikator ++)
			{
				array1[eingabe] = eingabe * multiplikator;
				System.out.print(array1[eingabe] + "\t");
			}
			System.out.println();
		}
		return array1;
	}
	
	public static int berechnung()
	{
		
		int ergebnis = 0;
		for(int eingabe = 1; eingabe <= 10; eingabe++)
		{
			for(int multiplikator = 1; multiplikator <= 10; multiplikator++)
			{
				ergebnis = eingabe * multiplikator;
				System.out.print(ergebnis + "\t");
				
			}
			System.out.println();
		}
		return ergebnis;
	}

}
