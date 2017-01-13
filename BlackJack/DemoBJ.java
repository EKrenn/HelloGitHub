
public class DemoBJ {

	public static void main(String[] args) {
		BlackJack bj = new BlackJack();
		Player p = new Player("Maxi", 20);
		Player p1 = new Player("Susi", 25);
		Player p2 = new Player("Resi", 30);
		bj.add(p);
		bj.addCard(p, 20);
		bj.addCard(p, 40);
		bj.add(p1);
		bj.addCard(p1, 30);
		bj.addCard(p1, 50);
		bj.add(p2);
		bj.addCard(p2, 40);
		bj.addCard(p2, 60);
		//bj.toString();
		//System.out.println(p.toString());
		
		
		// liefert das gleiche Ergebnis, .toString() wird automatisch aufgerufen
		System.out.println(bj.toString());
		System.out.println(bj);

	}

}
