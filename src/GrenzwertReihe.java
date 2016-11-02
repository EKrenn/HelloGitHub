
public class GrenzwertReihe {

	public static void main(String[] args) {
		
		int n = 0;
		double current = 0.0; 
		double previous= 0.0; 
		
		do
		{
			previous = 1/(Math.pow(2, n)); 
			current = 1/(Math.pow(2, n-1));
			n = n+1;

		}
		while((current - previous) < 0.0001);
		System.out.println(n);
	}

}
