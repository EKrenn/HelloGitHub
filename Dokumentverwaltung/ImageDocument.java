
public class ImageDocument extends Document {
	private static int sizeX;
	private static int sizeY;
	private static String colour;
	
	public ImageDocument(String fileName)
	{
		super(fileName);
	}
	public ImageDocument(String fileName, int sizeX, int sizeY, String colour)
	{
		super(fileName);
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.colour = colour;
	}
	public static void printDocument()
	{
		System.out.println("TextDocument: " + fileName + " => " + sizeX + ", " + sizeY + ", " + 
				colour);
	}

}
