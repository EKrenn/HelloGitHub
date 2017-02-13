package Zwischenklausur;

public class TicTacToeHelper {

	public static void main(String[] args) {
		char[][] b = new char[3][3];
		b[0][0] = 'X';
		b[0][1] = 'X';
		b[0][2] = 'O';
		b[1][0] = 'X';
		b[1][1] = ' ';
		b[1][2] = 'O';
		b[2][0] = 'O';
		b[2][1] = ' ';
		b[2][2] = 'X';

		printBoard(b);
		

	}
	public static char[][] generateEmptyBoard(int size)
	{
		char[][] board = new char[size][size];
		for(int x = 0; x < size; x++)
		{
			for (int y = 0; y < board[x].length; y++) 
			{
				board[x][y] = ' ';
			}
		}
		return board;
	}
	public static char[][] generateEmptyBoard(int sizeX, int sizeY)
	{
		char[][] board = new char[sizeX][sizeY];
		for(int x = 0; x < sizeX; x++)
		{
			for (int y = 0; y < board[x].length; y++) 
			{
				board[x][y] = ' ';
			}
		}
		return board;
	}
	/* Lange Variante, ev. nicht mal gefragt
	public static boolean validateBoard(char[][] board, int size)
	{
		int zx=0;
		int zy=0;
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				
				zy = y;		
			}
			zx = x;
		}
		
		if(zy == zx && size == zx)
			return true;
		else
			return false;
	}
	*/
	public static boolean validateBoard(char[][] board, int size)
	{
		if(board.length == size)
			return true;
		else
			return false;
	}
	
	public static void printBoard(char[][] board)
	{
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				System.out.print(board[i][j] + "\t");			
			}
			System.out.println();
		}
		
	}

}
