package konto;

public class Kontoausgabe {

	public static void main(String[] args) {
		
		// da ein neuer Konstruktor erstellt wurde, muss der Name direkt übergeben werden
			Konto kunde1 = new Konto("Max Mustermann");
			// siehe Kommentar oben - kann man sich sparen
			//kunde1.setInhaber("Max Mustermann");
			kunde1.aufbuchen(234.50);
			kunde1.abbuchen(200);
			kunde1.print();
			
			Konto kunde2 = new Konto("Susi Sorglos");
			// siehe Kommentar oben - kann man sich sparen
			//kunde1.setInhaber("Max Mustermann");
			kunde2.aufbuchen(10000);
			kunde2.abbuchen(200);
			kunde2.print();
			
			Konto kunde3 = new Konto("");
			// siehe Kommentar oben - kann man sich sparen
			//kunde1.setInhaber("Max Mustermann");
			kunde3.aufbuchen(34.50);
			kunde3.abbuchen(200);
			kunde3.print();
			
			//kunde3.print();
			
			/*
			if(kunde1.abbuchen(300))
			{
				System.out.println("erfolgreich");
				kunde1.print();
			}
			*/
			
			
			//String[] inhaber = {"Max Mustermann", "Susi Sorglos"};
			Konto[] konten = new Konto[1000];
			
			konten[0] = kunde1;
			
			//System.out.println(kunde1);
			
			

	}

}
