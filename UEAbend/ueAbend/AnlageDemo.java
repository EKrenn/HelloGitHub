package ueAbend;

public class AnlageDemo {

	public static void main(String[] args) {
		Anlage tisch = new Anlage("Schreibtisch", 1000, 10);
		tisch.abschreiben();
		tisch.simulate(6, 900);
		tisch.renew(300, 5);
		
		Anlage sessel = new Anlage ("Sessel", 150, 3);
		sessel.abschreiben();
		sessel.simulate(1, 20);
		

	}

}
