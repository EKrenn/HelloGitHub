
public class GrenzwertReihe {

	public static void main(String[] args) {
		//System.out.println(berechneGrenzwert(0.1));
		//System.out.println(berechneGrenzwertLoesung(0.001));
	}
	
	public static double berechneGrenzwert(double genauigkeit)
	{
		double previous = 0.0;
		double current = 0.0;
		
		
		for(int divisor = 1;;divisor++)
		{
			current = 1.0 / (divisor);
			//System.out.println("C: " + current);
			previous = 1.0 / (divisor);
			//System.out.println("P: " + previous);
			
			previous = previous + current;
			divisor *= 2;
			//System.out.println("Summe: " + previous);
			//System.out.println("Divisor: " + divisor);
			
			
			if(current - previous < genauigkeit)
			{
				//System.out.println("< genauigkeit: " + (current - previous));
					break;
			}
			
		}
		return previous;
		//return -1.0;
	}
	public static double berechneGrenzwertLoesung(double genauigkeit)
	{
		double previous = 0.0;
		double current = 0.0;
		
		
		for(int divisor = 1;;divisor = divisor * 2)
		{
			current = current + (1.0 / (divisor));	
			if(current - previous < genauigkeit)
			{
					break;
			}
			previous = current; 
			
		}
		return current;
		
	}
}
