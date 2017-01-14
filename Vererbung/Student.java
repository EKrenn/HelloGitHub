
public class Student extends PersonVer {
	public String ort;
	public int plz;
	public int hausnummer;
	
	public Student (String fn, String ln, String ort, int plz, int hausnummer)
	{
		super(fn, ln);
		//wird benötigt, wenn es keinen Construktor in der Basisklasse gibt
		//setFirstname(fn);
		//setLastname(ln);
		this.ort=ort;
		this.plz=plz;
		this.hausnummer=hausnummer;
	}

}
