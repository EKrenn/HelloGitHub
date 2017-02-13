package ueAbend;

public class StatsHelper {

	public static void main(String[] args) {
		int[][] numbers = {{3,4,-1},{10,7,0}};
		int[] num = {3,2,7,9,1,4};
		
			calcSimpleStats(numbers);
			einDimFeld(numbers);
			
			/*sortieren(num);
			for (int i = 0; i < num.length; i++) 
			{
				System.out.print(num[i] + " ");
				
			}*/
			
	}
	
	public static double[] calcSimpleStats(int[][] numbers)
	{
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double avg = 0;
		double avgsum = 0;
		int count = 0;
		
		int i = 0;
		int j = 0;
		for (i = 0; i < numbers.length; i++) 
		{
			for (j = 0; j < numbers[i].length; j++) 
			{
				//numbers[i][j] = (int) (Math.random() % 100);
				
				if(numbers[i][j] < min)
				{
					min = numbers[i][j];
				}
				if(numbers[i][j] > max)
				{
					max = numbers[i][j];
				}
				avgsum = avgsum + numbers[i][j];
				count++;
			}
		}
		avg = avgsum / count;
		double[] array = {min, max, avg};
		
		for (int k = 0; k < array.length; k++) 
		{
				System.out.print(array[k] + ", ");
		}
		
		return array;
	}
	
	public static int[] einDimFeld(int[][] numbers)
	{
		int[] array = new int[numbers.length * numbers[0].length];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) 
		{
			for (int j = 0; j < numbers[i].length; j++) {				
				array[index++] = numbers[i][j];
			}
			
		}
		return array;
	}
	
	/*
	public static void sortieren(int[] numbers)
	{
		for (int i = 0; i < numbers.length -1; i++) 
		{
			int aktuell = numbers[i];
			int nachbar = numbers[i +1];
			
			if(aktuell > nachbar)
			{
				numbers[i + 1] = aktuell; 
				numbers[i] = nachbar;
				sortieren(numbers);
			}
		}
	}*/
	
	

}
