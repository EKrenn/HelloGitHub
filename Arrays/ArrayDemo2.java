
public class ArrayDemo2 {

	public static void main(String[] args) {
		String [] Monat = {"Jänner", "Feber", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
		//int [] Kalenderzahl = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i = 0; i < Monat.length; i++)
			//.length = liefert die Anzahl der Elemente in einem Array 
			// i = Stelle im Feld, 1. Stelle = 0, somit bei den Monaten i+1, damit der Monat Jänner [1] hat und nicht [0]
		{
			System.out.println(Monat[i] + " [" + (i+1) + "]");
		}

	}

}
