
public class TextDocument extends Document {

	private static String content;
	
	public TextDocument(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	
	public TextDocument(String fileName, String content)
	{
		super(fileName);
		this.content = content;
	}
	public static void printDocument()
	{
		System.out.println("TextDocument: " + fileName + " => " + content);
	}
}
