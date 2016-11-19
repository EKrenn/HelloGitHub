
public class Person {
	public String vorname;
	public String nachname;
	public int alter;
	public Adresse adresse;
	
	public static void setAdresse(String strasse, int hausnummer, int plz, String stadt)
	{
		Adresse adresse = new Adresse();
		adresse.strasse = strasse;
		adresse.hausnummer = hausnummer;
		adresse.plz = plz;
		adresse.stadt = stadt;
	}
}
