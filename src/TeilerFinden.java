
public class TeilerFinden {

	public static void main(String[] args) {
		int t=2;
		int z=127;
		
		while(t < z)
		{
			if(z % t == 0)
			{
				System.out.println("Teiler: " + t + " gefunden");
				
			}
			t = t + 1;
		}
	}
}
