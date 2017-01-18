
public class OrganigrammHandler {
	
	public static String getChainOfCommand(Employee employee)
	{
		String ausgabe = employee.getName() + " [" + employee.getRole() + "]";
		
		if(employee.getSuperior() == null)
		{
			return ausgabe;
		}
		return ausgabe + " -> " + getChainOfCommand(employee.getSuperior());
	}
	
	public static String processHierarchy(Employee emp)
	{
		String ausgabe = emp.getRole() + "[" + emp.getName() + "]";
		
		
		if(emp.getSuperior() != null)
		{
			return "+ " + ausgabe + processHierarchy(emp.getSuperior());
		}
		else
		{
			return "- " + ausgabe + processHierarchy(emp.getSuperior());
		}
		//return ausgabe;
		
	}

}
