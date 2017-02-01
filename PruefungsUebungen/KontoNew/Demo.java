package KontoNew;

public class Demo {

	public static void main(String[] args) {
		Konto k = new Konto("Elisabeth");
		Girokonto gk = new Girokonto("Elisabeth", 1000);
		JugendGiroKonto jgk = new JugendGiroKonto("Hansi", 200, 100);
		SparKonto sk = new SparKonto("Huber");
		
		k.einzahlen(1000);
		gk.auszahlen(200);
		jgk.auszahlen(50);
		jgk.auszahlen(300);
		

	}

}
