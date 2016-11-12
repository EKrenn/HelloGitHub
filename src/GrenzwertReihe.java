
public class GrenzwertReihe {

	public static void main(String[] args) {
		berechneGrenzwert(0.1);
	}
	
	public static double berechneGrenzwert(double genauigkeit)
	{
		//double summe = 0.0; 
		double previous = 0.0;
		double current = 0.0;
		
		previous = 1.0 / 1;
		current = 1.0 / 1*2;
		for(int divisor = 1;;divisor++)
		{
			current = 1.0 / (divisor);
			System.out.println("C: " + current);
			previous = 1.0 / (divisor);
			System.out.println("P: " + previous);
			
			previous = previous + current;
			divisor *= 2;
			System.out.println("Summe: " + previous);
			System.out.println("Divisor: " + divisor);
			
			
			if(current - previous < genauigkeit)
			{
				System.out.println("< genauigkeit: " + (current - previous));
					break;
			}
			
		}
		return previous;
		//return -1.0;
	}
}
