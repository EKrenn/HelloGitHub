package charArray;
import java.lang.reflect.Array;

public class CharArray {

	
	private char[] myArray;
	public static int countObjects;
	
	public CharArray(char[] array)
	{
		this.myArray = array;
		countObjects++;
	}
	
	public void print()
	{
		for(int i = 0; i < this.myArray.length; i++)
		{
			System.out.print(myArray[i]);
			
		}
		System.out.println();
		
	}
	public void print(int start, int end)
	{
		if(start >= 0 && end >= start && end < this.myArray.length)
		{
			for(int i = start; i < end; i ++)
			{
				System.out.print(myArray[i]);
				
			}
		}
		
		System.out.println();
		
	}
	public int length()
	{
		return Array.getLength(this.myArray);
	}
	

}
