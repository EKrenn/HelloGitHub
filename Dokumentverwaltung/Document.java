
public class Document {
	protected String fileName;
	
	public Document(String fileName) {
		super();
		this.fileName = fileName;
	}

	public void printDocument()
	{
		System.out.println("Document: " + fileName + " printing");
	}
	
	public String getFileName()
	{
		return this.fileName;
	}

}
