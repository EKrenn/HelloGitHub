package Pruefungsbeispiel.PR1_HK_05022016.src.org.campus02.rec;

public class File extends FSEntry {
	
	private String extension;
	private int size;
	
	public File(String name,String extension,int size) {
		super(name);
		this.extension = extension;
		this.size = size;
	}
	
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void print() {
		System.out.println(getName() + "." + extension + " : " + size + " MB");
	}

}
