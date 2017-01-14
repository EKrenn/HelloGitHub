import java.util.ArrayList;

public class EmployeeManager {
	
	private ArrayList<Employee> employee = new ArrayList<>();
	
	public void addEmployee(Employee e)
	{
		employee.add(e);
	}
	
	public Employee findByMaxSalary()
	{
		double max = 0.0;
		Employee found = null;
		// Durchlaufe die Liste
		for(Employee e : employee)
		{
			// Wenn das aktuelle Gehalt größer als Max?
			if(e.getSalary() > max)
			{
				// Wenn ja: Max = das neue größere Gehalt
				max = e.getSalary();
				// und der Employee (found) = der aktuelle Mitarbeiter
				found = e;
			}
		}
		// liefert den Mitarbeiter zurück
		return found;
	}
	
	
	public Employee findByEmpNumer(int number)
	{
		for(Employee e : employee)
		{
			if(e.getEmpNumber() == number)
			{
				return e;
			}
		}
		// Wenn kein Employee diese Nummer aufweist, braucht man auch ein return
		return null;
	}
	public ArrayList<Employee> findByDepartment(String department)
	{
		ArrayList<Employee> found = new ArrayList<>();
		for(Employee e : employee)
		{
			if(department.equals(e.getDepartment()))
			{
				//Wenn ein Mitarbeiter gefunden wird, dann der neuen Liste anfügen
				found.add(e);
			}
			
		}
		return found;
		
	}
	public ArrayList<Employee> returnList()
	{
		for(int i = 0; i < employee.size(); i++)
			employee.get(i);
		return employee;
	}
	

}
