package bruch;

public class BruchDemo {

	public static void main(String[] args) {
		Bruch bruch = new Bruch(5,7);
		// Anzahl kommt immer nur 1x vor - der Wert pro Objekt und Klasse ist gleich
		System.out.println("bruch: " + bruch.anzahlObjekte);
		System.out.println("Bruch: " + Bruch.anzahlObjekte);
		
		Bruch bruch1 = new Bruch(3,4);
		System.out.println("bruch: " + bruch.anzahlObjekte);
		System.out.println("bruch1: " + bruch1.anzahlObjekte);
		System.out.println("Bruch: " + Bruch.anzahlObjekte);
		
		
		System.out.println(bruch.toDecimal());
		bruch.print();
		// Zuweisen zum bruch ist nötig, da sonst derselbe Wert als 
		// Lösung heraus kommt
		bruch = bruch.multiplicate(bruch);
		bruch.print();
		bruch = bruch.multiplicate(bruch, bruch1);
		bruch.print();

	}

}
