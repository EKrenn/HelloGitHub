import java.util.ArrayList;

public class PrintManager {
	
	private ArrayList<Document> docs = new ArrayList<Document>();
	
	public void addDocument(Document d)
	{
		docs.add(d);
	}
	
	public void printAll()
	{
		for(Document d : docs)
			d.printDocument();
	}
	
	public Document findDocument(String fileName)
	{
		for(Document d : docs)
		{
			if(d.fileName.equals(fileName))
				return d;
		}
		return null;
	}

}
