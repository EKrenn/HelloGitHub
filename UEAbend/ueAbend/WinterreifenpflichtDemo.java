package ueAbend;

public class WinterreifenpflichtDemo {

	public static void main(String[] args) {
		isWinterreifenPflicht(2, true);

	}
	public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn)
	{
		if((temperatur < 10 && rutschigeFahrbahn) || temperatur < 4)
		{
			System.out.println("Bitte Winterreifen verwenden");
			return true;
			
		}
		else
		{
			System.out.println("Winterreifen sind nicht nötig");
			return false;
		}
	}

}
