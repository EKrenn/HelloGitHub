package ueAbend;

public class FourWinsMain {

	public static void main(String[] args) {
		FourWins spiel = new FourWins(8,8);
		spiel.playerA(0, 0);
		System.out.println(spiel.winner());
		
		//spiel.playerB(0, 1);
		//System.out.println(spiel.winner());
		
		spiel.playerA(1, 0);
		System.out.println(spiel.winner());
		
		//spiel.playerB(1, 1);
		//System.out.println(spiel.winner());
		
		spiel.playerA(2, 0);
		System.out.println(spiel.winner());
		
		//spiel.playerB(2, 1);
		//System.out.println(spiel.winner());
		
		spiel.playerA(3, 0);
		System.out.println(spiel.winner());
		
		//spiel.playerB(3, 1);
		//System.out.println(spiel.winner());
		
		//System.out.println(spiel.winner());
	}

}
