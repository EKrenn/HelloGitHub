
public class EmployeeDemo {

	public static void main(String[] args) {
		EmployeeManager emp = new EmployeeManager();
		Employee emp1 = new Employee(1, "Max Muster", 2000.0, "IT");
		emp.addEmployee(emp1);
		emp.findByDepartment("IT");
		
	}

}
