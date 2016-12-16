
public class DemoBJ {

	public static void main(String[] args) {
		BlackJack bj = new BlackJack();
		Player p = new Player("Maxi", 20);
		bj.add(p);
		bj.addCard(p, 20);
		System.out.println(bj);

	}

}
