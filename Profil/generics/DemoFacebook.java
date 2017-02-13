package generics;

import java.util.GregorianCalendar;

public class DemoFacebook {

	public static void main(String[] args) {
		// Klasssen initailisieren, um auf die Klasse zugreifen zu können
		MayBeInt alter = new MayBeInt(30,  2);
		MayBe<Double> gehalt = new MayBe<Double>(2000.0,  4);
		MayBe<String> bezStatus = new MayBe<String>("complicated", 1);
		GregorianCalendar calender = new GregorianCalendar(1999, 1, 1);
		MayBe<GregorianCalendar> gebDatum = new MayBe<GregorianCalendar>(new GregorianCalendar(1999, 1, 1), 2);
				
		Profil p = new Profil("Susi", "Sorglos", "suso@gmx.net", alter, gehalt, bezStatus, gebDatum);
		
		// Print-Methode von Profil aufrufen, um Ausgabe zu haben
		p.print();
	}

}
