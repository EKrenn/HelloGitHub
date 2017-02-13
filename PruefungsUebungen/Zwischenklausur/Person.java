package Zwischenklausur;

public class Person {
	private int id;
	private String vorname;
	private String nachname;
	private int koerpergroesse;
	private byte aktivitaetslevel;
	
	public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.koerpergroesse = koerpergroesse;
		this.aktivitaetslevel = aktivitaetslevel;
	}

	public int getKoerpergroesse() {
		return koerpergroesse;
	}

	public void setKoerpergroesse(int koerpergroesse) {
		this.koerpergroesse = koerpergroesse;
	}

	public byte getAktivitaetslevel() {
		return aktivitaetslevel;
	}

	public void setAktivitaetslevel(byte aktivitaetslevel) {
		this.aktivitaetslevel = aktivitaetslevel;
	}

	public int getId() {
		return id;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}
	
	public String rechneBMI(int gewicht)
	{
		double bmi = gewicht / ((koerpergroesse / 100.0) * (koerpergroesse / 100.0));
		if(bmi < 18.5)
			return "Untergewicht";
		else if(bmi < 25)
			return "Normalgewicht";
		else if(bmi < 30)
			return "Übergewicht";
		else 
			return "Adipositas";
	}
	
	public void printPerson(int gewicht)
	{
		String print = "";
		switch (aktivitaetslevel) 
		{
		case 1:
			print = "Couch Potatoe";
			break;
		case 2:
			print = "Gelegenheitssportler";
			break;
		case 3:
			print = "Sportler";
			break;
		case 4: 
			print = "Profisportler";
			break;
		}
		System.out.println(getVorname() + " " + getNachname() + ", " + print + ", " + rechneBMI(gewicht));
	}
	
}
