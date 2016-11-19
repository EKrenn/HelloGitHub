
public class Kontoausgabe {

	public static void main(String[] args) {
		Konto ausgabe = new Konto();
		ausgabe.setInhaber("Max Mustermann");
		ausgabe.aufbuchen(234.50);
		ausgabe.abbuchen(34.50);
	}

}
