package charArray;

public class CharArrayDemo {

	public static void main(String[] args) {
		char[] test = new char[] {'H','a','l','l','o'};
		char[] test2 = new char[4];
		test2[0] = 'e';
		test2[0] = 'f';
		test2[0] = 'g';
		test2[0] = 'h';
		
		String testString = "Hallo in PR1";
		char[] testFromString = testString.toCharArray();
		
		CharArray a1 = new CharArray(testFromString);
		CharArray a2 = new CharArray(test);
		a1.print();
		a1.print(4, 10);
		System.out.println(a1.length());
		System.out.println("Anzahl Arrays: " + CharArray.countObjects);
		

	}

}
