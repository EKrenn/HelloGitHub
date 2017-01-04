
public class DemoBJ {

	public static void main(String[] args) {
		BlackJack bj = new BlackJack();
		Player p = new Player("Maxi", 20);
		bj.add(p);
		bj.addCard(p, 20);
		bj.addCard(p, 40);
		//bj.toString();
		System.out.println(p.toString());
		System.out.println(bj.toString());
		System.out.println(bj.getValue(p));

	}

}
