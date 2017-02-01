package RekursionFolder;

public class File extends Item
{
	private int size;

	public File(String name, int size) {
		super(name);
		this.size = size;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSize(int currentDeep) 
	{
		return size;
		// bei Variante 2
		//return size + super.getSize(currentDeep);
	}
	
	

}
