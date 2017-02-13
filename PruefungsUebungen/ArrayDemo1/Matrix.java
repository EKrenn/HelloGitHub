package ArrayDemo1;

public class Matrix {

	public static void main(String[] args) 
	{
		generateIdentityMatrix(3);
		//printMatrix(new double[4][2]);

	}
	
	public static double[][] generateIdentityMatrix(int size)
	{
		double[][] array = new double[size][size];
		//int zeile;
		//int spalte;
		for(int zeile = 0; zeile < array.length; zeile++)
		{
			array[zeile][zeile] = 1.0;
			for(int spalte = 0; spalte < array.length; spalte++)
			{
				System.out.print(array[zeile][spalte] + "\t");
			}
			System.out.println();
		}
		return array;
	}
	
	public static void printMatrix(double[][] matrix)
	{
		for(int zeile = 0; zeile < matrix.length; zeile ++)
		{
			//matrix[zeile][zeile] = 1;
			for(int spalte = 0; spalte < matrix[zeile].length; spalte ++)
			{
				System.out.print(matrix[zeile][spalte] + "\t");
			}
			System.out.println();
		}
	}

}
