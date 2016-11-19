
public class Verwaltung {

	public static void main(String[] args) {
		/*
		 * Einfache Variante:
		Person student = new Person();
		student.vorname = "Max";
		student.nachname = "Mustermann";
		student.alter = 39;
		student.adresse = new Adresse();
		student.adresse.strasse = "Hauptplatz";
		student.adresse.hausnummer = 2;
		student.adresse.plz = 8010;
		student.adresse.stadt = "Graz";
		
		System.out.println(student.vorname + " " + student.nachname + " " + student.alter);
		*/
		/* Variante mit Methoden */
		methodePerson("Max", "Mustermann", 39);
		methodeAdresse("Hauptplatz", 33, 8010, "Graz");
	}
	public static void methodePerson(String vorname, String nachname, int alter)
	{
		Person student = new Person();
		student.vorname = vorname;
		student.nachname = nachname;
		student.alter = alter;
		//String ausgabe = vorname + " " + nachname + " " + alter; 
		System.out.println("Name: " + vorname + " " + nachname + " " + alter);
	}
	public static void methodeAdresse(String strasse, int hausnummer, int plz, String stadt)
	{
		Adresse adresse = new Adresse();
		adresse.strasse = strasse;
		adresse.hausnummer = hausnummer;
		adresse.plz = plz;
		adresse.stadt = stadt;
		System.out.println("Straße: " + strasse + " " + hausnummer);
		System.out.println("PLZ Ort: " + plz + " " + stadt);
	}

}
