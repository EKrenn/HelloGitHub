
public class Wuerfelspiel {

	public static void main(String[] args) {
		triesUntilThreeOnes();

	}
	public static int triesUntilThreeOnes()
	{
		int gewuerfelt;
		int ergebnis;
		int anzahl = 0; 
		int anzGewuerfelt = 0;
		
		do
		{
			anzGewuerfelt++;
			gewuerfelt = 1 + (int)(Math.random() * 6);
			ergebnis = gewuerfelt;
			System.out.println(ergebnis);
			if(ergebnis == 1)
			{
				System.out.println("--" + ergebnis );
				anzahl++;
			}
		}
		while(anzahl < 3);
		System.out.println("Benötigte Würfe: " + anzGewuerfelt);
		return anzGewuerfelt;
	}

}
