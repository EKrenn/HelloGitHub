
public class Customer extends PersonVer{
	public int id;
	
	public Customer(String fn, String ln, int id) {
		// greift auf den Construktor der Basisklasse zu
		super(fn, ln);
		
		//wird ben�tigt, wenn es keinen Construktor in der Basisklasse gibt
		//setFirstname(fn);
		//setLastname(ln);
		
		this.id = id;
		
	}
	//Zeigt, dass eine Methode �berschrieben wird
	// Fehler werden angezeigt
	@Override
	public void getInfo()
	{
		System.out.println("This is a customer");
	}
	
	
	
	

}
