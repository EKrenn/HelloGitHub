package Pruefungsbeispiel.PR1_HK_05022016.src.org.campus02.rec;

public abstract class FSEntry {

	private String name;

	public FSEntry(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public abstract void print();
	
}
