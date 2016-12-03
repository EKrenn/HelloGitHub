
public class LohnBonusAbrechnungDemo {

	public static void main(String[] args) {
		LohnBonusAbrechnung lohn = new LohnBonusAbrechnung("Maxi", "Huber", 2000);
		lohn.monatsAbrechnung();
		System.out.println("Jahresgehalt von " + lohn.getVorname() + " " + lohn.getNachname() + " ist " + lohn.jahresAbrechnung());
		//lohn.jahresAbrechnung();
		System.out.println("Jahresgehalt von " + lohn.getVorname() + " " + lohn.getNachname() + " ist " + lohn.jahresAbrechnung(3));

		LohnBonusAbrechnung lohn2 = new LohnBonusAbrechnung("Susi", "Maier", 1800);
		lohn2.monatsAbrechnung();
		System.out.println("Jahresgehalt von " + lohn2.getVorname() + " " + lohn2.getNachname() + " ist " + lohn2.jahresAbrechnung());
		System.out.println("Jahresgehalt von " + lohn2.getVorname() + " " + lohn2.getNachname() + " ist " + lohn2.jahresAbrechnung(3));
		
	}

}
