package ueAbend;

public class VerwaltungsstrafeMain {

	public static void main(String[] args) {
		
		Verwaltungsstrafe strafe = new Verwaltungsstrafe("Maxi", "Huber", "G-970 I");
		strafe.alkohol(0.8);
		strafe.strafe(19);
		
		System.out.println("Strafe: " + strafe.getStrafe());
	}

}
