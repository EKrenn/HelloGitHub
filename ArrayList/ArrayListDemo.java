import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Mary");
		names.add("Phil");
		
		System.out.println("size? " + names.size());
		System.out.println("contains Peter? " + names.contains("Peter"));
		System.out.println("contains Mary? " + names.contains("Mary"));
		
		
		// Variable "name" ist irrelevant, ist für die weitere Nutzung im Block wichtig
		for(String name : names)
		{
			System.out.print(name + ", ");
			
		}
		System.out.println();
		// get(1) = Element an der zweiten Position, ArrayList beginnt mit Index 0
		System.out.println("name 2 = " + names.get(1));
		
		//Schleife mit einem Iterator
		Iterator<String> it = names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
