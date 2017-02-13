package Land;

public class Demo {
	public static void main(String[] args) {
		Bundesland stmk = new Bundesland(10000);
		Bundesland bgld = new Bundesland(20000);
		
		Bundesstaat staat = new Bundesstaat();
		staat.addLand(stmk);
		staat.addLand(bgld);
		
		System.out.println(staat.getBruttoSozialProdukt());
	}

}
