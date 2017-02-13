package Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		/*EmployeeManager emp = new EmployeeManager();
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
		//System.out.println(org.getChainOfCommandCount(m3, 0));
		System.out.println(org.processHierarchy(m1));
		*/
		
		EmployeeManager em = new EmployeeManager();
		
		//create employees and build hierarchy
		//according to organigram
		Employee ceo = new Employee(1, "Mitarbeiter 1", 7_500, "Management", "CEO");
		
		Employee cto = new Employee(2, "Mitarbeiter 2", 6_500, "Management", "CTO");
		cto.setSuperior(ceo);
		ceo.add(cto);
		
		Employee dev1 = new Employee(3, "Mitarbeiter 3", 3_500, "Engineering", "Dev");
		dev1.setSuperior(cto);
		Employee dev2 = new Employee(4, "Mitarbeiter 4", 3_500, "Engineering", "Dev");
		dev2.setSuperior(cto);
		
		cto.add(dev1);
		cto.add(dev2);
		
		Employee hr = new Employee(5, "Mitarbeiter 5", 6_500, "Management", "HR");
		hr.setSuperior(ceo);
		ceo.add(hr);
			
		//register all employees
		em.addEmployee(ceo);
		em.addEmployee(cto);
		em.addEmployee(hr);
		em.addEmployee(dev1);
		em.addEmployee(dev2);
		
		//System.out.println(OrganigrammHandler.getChainOfCommand(dev1));
		System.out.println(OrganigrammHandler.processHierarchy(ceo));
		System.out.println(OrganigrammHandler.processHierarchy(ceo, "  "));
		
	}

}
