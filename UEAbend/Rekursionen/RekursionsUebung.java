package Rekursionen;

public class RekursionsUebung {

	public static void main(String[] args) {
		//System.out.println(countCharX("xmaxs"));
		//System.out.println(changeCharXToY("xmaxs"));
		System.out.println(noX("xexlxixsxaxbxextxh"));

	}
	
	public static int countCharX(String str)
	{
		// Abbruchbedingung muss beide Abfragen haben, da sonst eine Exception zurückkommt
		if(str == null || str.length() == 0)
		{
			return 0;
		}
		if(str.charAt(0) == 'x')
		{
			return  1 + countCharX(str.substring(1));
		}
		else
		{
			return  0 + countCharX(str.substring(1));
		}
		
		/*
		 Seine Lösung
		if(str == null || str.length() == 0)
		{
			return 0;
		}
		if(str.startsWith("x"))
		{
			return 1 + countCharX(str.substring(1));
		}
	
			return 0 + countCharX(str.substring(1));
		*/
		
	}
	
	public static String changeCharXToY(String str)
	{
		// Abbruchbedingung muss beide Abfragen haben, da sonst eine Exception zurückkommt
				if(str == null || str.length() == 0)
				{
					return str;
				}
				// Wenn der Character an der Position (0) gleich dem Character 'x', ...
				if(str.charAt(0) == 'x')
				{
					//... gib den Character 'y' an der Position str.charAt(0) + dem rekursiven String.substring(1) retour -->
					//schneide diesen Character ab und ersetze ihn durch 'y' --> ('y' == "y" --> bei dem Beispiel)
					return "y" + changeCharXToY(str.substring(1));
				}
				else
					return str.charAt(0) + changeCharXToY(str.substring(1));
		
	}
	
	public static String noX(String str)
	{
		if(str == null || str.length() == 0)
		{
			return str;
		}
		
		if(str.charAt(0) == 'x')
		{
			// wenn charAt(0) -> Character an dieser Position gleich 'x', dann schneide ihn ab und liefere alles, ohne das abgeschnittene retour
			return noX(str.substring(1));
		}
		else
		{
			// wenn der charAt(0) -> Character an dieser Position NICHT gleich 'x', dann liefere diesen String + alles andere retour
			return str.charAt(0) + noX(str.substring(1));	
		}
	}

}
