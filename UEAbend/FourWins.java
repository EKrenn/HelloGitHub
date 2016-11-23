
public class FourWins {

	char[][] charArray;
	public FourWins(int sizeX, int sizeY)
	{
		charArray = new char[sizeX][sizeY];
		for(int x = 0; x < sizeX; x++)
		{
			for(int y = 0; y < sizeY; y++)
			{
				charArray[x][y] = ' ';
			}
		}
	}
	
	
	public boolean playerA(int x, int y)
	{
		if(charArray[x][y] == ' ')
		{
			charArray[x][y] = 'A';
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean playerB(int x, int y)
	{
		
		if(charArray[x][y] == ' ')
		{
			charArray[x][y] = 'B';
			//System.out.println("Setzt: B ");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private char fourInRow()
	{
		/* seine Lösung 
		char lastCharacter = ' ';
		byte cntSameCharacters = 0;
		
		
		for(int y =0; y < charArray[0].length; y++)
		{
			for(int x =0; x < charArray.length; x++)
			{
				if(charArray[x][y] != lastCharacter)
				{
					lastCharacter = charArray[x][y];
					cntSameCharacters = 1;
				}
				else if (charArray[x][y] != ' ')
				{
					cntSameCharacters++;
				}
				if(cntSameCharacters == 4)
				{
					return lastCharacter;
				}
			}
			cntSameCharacters = 0;
			lastCharacter = ' ';
		}
		return '-';
		*/
		// Counter, ob VierGewinnt eintrifft ist zu Beginn 0
		int counter = 0;
		// Charakter des Array-Feldes ist zu Beginn ' ' 
		char resentPlayer = ' ';
		//Das Array an der Position x und Position y durchlaufen
		// x -> Spalten durchlaufen, [0] - weil man die erste Spalte durchgeht
		// y -> Zeilen durchlaufen
		for(int x = 0; x < charArray[0].length; x++)
		{
			for(int y = 0; y < charArray.length; y++)
			{
				// wenn der Charakter gleich A, dann wnn der ResentPlayer gleich A - erhöhe den Counter (beim ersten Durchlauf: 1, beim zweiten 2...)
				if(charArray[x][y] == 'A')
				{
					if(resentPlayer == 'A')
					{
						counter++;
					}
					// sonst: setze Counter wieder auf 1 und den resentPlayer auf A
					else
					{
						counter = 1;
						resentPlayer = 'A';
					}
					// wenn 4 Charakters hintereinander gesetzt sind, dann gib den 
					if(counter == 4)
					{
						return resentPlayer;
					}
					
				}
				// selbe Abfrage wie oben, nur mit B
				else if(charArray[x][y] == 'B')
				{
					if(resentPlayer == 'B')
					{
						counter++;
					}
					else
					{
						counter = 1;
						resentPlayer = 'B';
					}
					if(counter == 4)
					{
						return resentPlayer;
					}
				}
			}
		}
		return '-';
	}
	private char fourInColumn()
	{
		// Counter, ob VierGewinnt eintrifft ist zu Beginn 0
				int counter = 0;
				// Charakter des Array-Feldes ist zu Beginn ' ' 
				char resentPlayer = ' ';
				//Das Array an der Position x und Position y durchlaufen
				// x -> Spalten durchlaufen
				// y -> Zeilen durchlaufen, [0] - weil man die erste Spalte durchgeht
				for(int y = 0; y < charArray[0].length; y++)
				{
					for(int x = 0; x < charArray.length; x++)
					{
						// wenn der Charakter gleich A, dann wnn der ResentPlayer gleich A - erhöhe den Counter (beim ersten Durchlauf: 1, beim zweiten 2...)
						if(charArray[x][y] == 'A')
						{
							if(resentPlayer == 'A')
							{
								counter++;
							}
							// sonst: setze Counter wieder auf 1 und den resentPlayer auf A
							else
							{
								counter = 1;
								resentPlayer = 'A';
							}
							// wenn 4 Charakters hintereinander gesetzt sind, dann gib den 
							if(counter == 4)
							{
								return resentPlayer;
							}
							
						}
						// selbe Abfrage wie oben, nur mit B
						else if(charArray[x][y] == 'B')
						{
							if(resentPlayer == 'B')
							{
								counter++;
							}
							else
							{
								counter = 1;
								resentPlayer = 'B';
							}
							if(counter == 4)
							{
								return resentPlayer;
							}
						}
					}
				}
				return '-';
	}
	public char winner()
	{
		if(fourInRow() != ' ')
		{
			return fourInRow();
		}
		if(fourInColumn() != ' ')
		{
			return fourInColumn();
		}
		return ' ';
	}

}
