package Rekursion;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println(methPalindrom("!Rentner"));

	}
	
	private static boolean methPalindrom(String wort)
	{
		if(wort.length() <= 1)
		{
			return true;
		}
		char first = Character.toLowerCase(wort.charAt(0));
		char last = Character.toLowerCase(wort.charAt(wort.length()-1));
		
		// Ist das Character ein Buchstabe? liefert true oder false zurück
		//Character.isLetter(last);

		//Funktioniert nicht, wenn das erste oder letzte Zeichen kein Buchstabe ist.		
				/*if(first != last)
				{
					return false;
				}
				else */if(Character.isLetter(last) && Character.isLetter(first) )
				{
					if(first == last)
					{
						//Substring nimmt den noch vorhandenen String von der Position 1 bis zur Position length - 1
						return methPalindrom(wort.substring(1, wort.length()-1));
					}
					return false;
				}
				
		if(Character.isLetter(last) == false)
		{
			return methPalindrom(wort.substring(0, wort.length()-1));
		}
		if(Character.isLetter(first) == false)
		{
			return methPalindrom(wort.substring(1, wort.length()));
		}
		return false;
		
	}

}
