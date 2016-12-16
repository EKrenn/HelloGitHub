package generics;

import java.util.GregorianCalendar;

public class Profil {
	private String vorname;
	private String nachname;
	private String email;
	private MayBeInt alter;
	private MayBeInt gehalt;
	private String passwort;
	private MayBe<String> bezStatus;
	private int plz;
	private MayBe<GregorianCalendar> gebDatum;
	
	// Konstruktor mit den Werten, die einzugeben sind
	// bei verwendung von anderen Klassen (MayBeInt) ist dies auch als Typ zu übergeben
	public Profil(String vorname, String nachname, String email, MayBeInt alter, MayBeInt gehalt, MayBe<String> bezStatus, MayBe<GregorianCalendar> gebDatum)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.alter = alter;
		this.gehalt = gehalt;
		this.bezStatus = bezStatus;
		this.gebDatum = gebDatum;
	}
	
	// Ausgabe-Methode
	public void print()
	{
		System.out.println(vorname + " / " + nachname);
	
		// alter = Initialisierung von Klasse MayBeInt -> Werte sind variabel
		// werden erst mit dem Aufruf des Konstruktors in der Mainmethode übergeben
		System.out.print("Alter: ");
		alter.print();
		System.out.print("Gehalt: ");
		gehalt.print();
		System.out.print("Beziehungsstatus: ");
		bezStatus.print();
		System.out.print("Geburtsdatum: ");
		gebDatum.print();
	}

}
