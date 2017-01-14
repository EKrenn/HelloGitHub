
public class EmployeeDemo {

	public static void main(String[] args) {
		EmployeeManager emp = new EmployeeManager();
		Employee emp1 = new Employee(1, "Max Muster", 2000.0, "IT");
		OrganigrammHandler org = new OrganigrammHandler();
		
		emp.addEmployee(emp1);
		emp.findByDepartment("IT");
		
		// neuen Konstruktor in Klasse Employee erstellt, und den Suporier (Vorgesetzten) 
		//direkt übergeben
		Employee m1 = new Employee(2, "Mitarbeiter1", 2000.0, "IT", "CEO", null);
		Employee m2 = new Employee(3, "Mitarbeiter2", 2000.0, "IT", "CTO", m1);
		Employee m3 = new Employee(4, "Mitarbeiter3", 2000.0, "IT", "Dev", m2);
		Employee m4 = new Employee(5, "Mitarbeiter4", 2000.0, "IT", "Dev", m2);
		Employee m5 = new Employee(6, "Mitarbeiter5", 2000.0, "IT", "HR", m1);
		
		//System.out.println(org.getChainOfCommand(m5));
		System.out.println(org.processHierarchy(m4));
		
	}

}
