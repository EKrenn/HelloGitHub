package ArrayDemo1;

public class ArrayDemo2 {

	public static void main(String[] args) {
		String[] array = {"Jänner", "Feber", "März", "April", "Mai", "Juni",
				"Juli", "August", "September", "Oktober", "November", "Dezember"};
		
		for(int i = 0; i < array.length; i++)
		{
			
			System.out.println(array[i] + " ["+(i+1)+"]");
			
		}

	}

}
