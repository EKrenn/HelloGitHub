package RekursionFolder;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Folder f1 = new Folder("f1");
		f1.add(new File("test", 222));
		f1.add(new File("movie", 444));
		
		Folder f2 = new Folder("f2");
		f2.add(new File("datei", 400));
		f1.add(f2);
		
		Folder f3 = new Folder("f3");
		f3.add(new File("datei3", 300));
		f3.add(new File("datei4", 500));
		
		Folder root = new Folder("root");
		root.add(f1);
		root.add(f3);
		
		System.out.println(root.getSize(0));

	}

}
