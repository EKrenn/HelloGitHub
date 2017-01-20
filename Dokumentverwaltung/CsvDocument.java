import java.util.ArrayList;

public class CsvDocument extends Document {
		
	private static ArrayList<String> lines = new ArrayList<String>();
	
	public CsvDocument(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	
	public CsvDocument(String fileName, ArrayList<String> lines) {
		super(fileName);
		this.lines = lines;
		// TODO Auto-generated constructor stub
	}
	
	public static void addLine(String line)
	{
		lines.add(line);
	}
	public static void printDocument()
	{
		for(int i = 0; i < lines.size(); i++)
		{
			System.out.println("TextDocument: " + fileName + " => " + lines.get(i));
		}
		
	}

}
