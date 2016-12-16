import java.util.HashSet;

public class SetDemoEinfach {

	public static void main(String[] args) {
		
		HashSet<Integer> setNums = new HashSet<Integer>();
		setNums.add(3);
		setNums.add(5);
		setNums.add(1);
		setNums.add(8);
		
		System.out.println("size? " + setNums.size());
		// Durchläuft das HashSet und gibt die Werte ungeordnet aus
		for(Integer i : setNums)
		{
			System.out.println(i);
		}
		
		System.out.println("contains 4? " + setNums.equals(4));
		if(setNums.remove(3))
		{
			System.out.println("3 removed");
		}
		System.out.println("size? " + setNums.size());
		

	}

}
