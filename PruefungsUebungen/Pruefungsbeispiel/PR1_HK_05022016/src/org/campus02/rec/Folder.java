package Pruefungsbeispiel.PR1_HK_05022016.src.org.campus02.rec;

import java.util.ArrayList;

public class Folder extends FSEntry {

	private ArrayList<FSEntry> files = new ArrayList<>();
	private ArrayList<FSEntry> folders = new ArrayList<>();
	
	public Folder(String name) {
		super(name);
	}
	
	public void putEntry(File entry) {
		files.add(entry);
	}
	
	public void putEntry(Folder entry) {
		folders.add(entry);
	}
			
	@Override
	public void print() {
		System.out.println(getName() + " : Folder");
	}
	
	public void printAll() {
		for (FSEntry folder : folders) 
		{
			folder.print();
			
		}
		for (FSEntry file : files) 
		{
			file.print();			
		}
		
	}
	
	public void listAllContent(String prefixPath) {
		// TODO implement the recursive(!) method here...	
		for (FSEntry file : files) 
		{	
			System.out.print(prefixPath + "/");
				file.print();	
				
		}
		for (FSEntry folder : folders) 
		{
			Folder f = (Folder) folder;
			f.listAllContent(folder.getName());
		}
	}
	
	public void printTree(String indent) 
	{
		System.out.println(indent + "+" + getName() + "/");			
		for (FSEntry file : files) 
		{
			System.out.print(indent + "  -");
			file.print();
		}
		for (FSEntry folder : folders) 
		{
			Folder f = (Folder) folder;
			f.printTree(indent + "  ");
		}
		
	}
	
	public int zaehlen(int zahl)
	{
		if(zahl <= 0)
		{
			return 0;
		}
		else 
			System.out.println(zahl);
			return zaehlen(zahl - 1);
	}

}
