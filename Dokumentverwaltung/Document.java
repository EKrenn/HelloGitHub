
public class Document {
	protected static String fileName;
	
	public Document(String fileName) {
		super();
		this.fileName = fileName;
	}

	public static void printDocument()
	{
		System.out.println(fileName);
	}

}
