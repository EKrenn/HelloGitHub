package Sortieren;

public class Person implements Comparable<Person>{
	public String vorname;
	public String nachname;
	public int alter;
	public int id; 
	

	public Person(int id, String vorname, String nachname) {
		super();
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		
	}

	public int getId()
	{
		return id;
	}
	

	public String getVorname() {
		return vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public int getAlter() {
		return alter;
	}

	

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", alter=" + alter + ", id=" + id + "]";
	}


	@Override
	public int compareTo(Person o) {
		if(this.id < o.id)
			return -1;
		if(this.id > o.id)
			return 1;
		return 0;
	}
	
}
