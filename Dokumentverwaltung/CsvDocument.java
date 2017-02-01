import java.util.ArrayList;

public class CsvDocument extends Document {
		
	private ArrayList<String> lines = new ArrayList<String>();
	
	public CsvDocument(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	
	public CsvDocument(String fileName, ArrayList<String> lines) {
		super(fileName);
		this.lines = lines;
		// TODO Auto-generated constructor stub
	}
	
	public void addLine(String line)
	{
		lines.add(line);
	}
	
	@Override
	public void printDocument()
	{
		
		System.out.println("CsvDocument: " + fileName);
		for(String string : lines)
			System.out.println(string);
		
		/*for(int i = 0; i < lines.size(); i++)
		{
			System.out.println("TextDocument: " + fileName + " => " + lines.get(i));
		}
		*/
		
	}

}
