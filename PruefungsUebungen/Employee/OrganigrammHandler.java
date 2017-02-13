package Employee;

import java.util.ArrayList;

public class OrganigrammHandler 
{
	public static String getChainOfCommand(Employee employee)
	{
		String ausgabe = "";
		if(employee.getSuperior() == null)
		{
			return employee.getName() + "["+employee.getRole()+"]";
		}
		
		else
		{
			ausgabe = employee.getName() + "["+employee.getRole()+"]" + "--> ";
			return ausgabe + getChainOfCommand(employee.getSuperior());
		}
	}
	
	public static String processHierarchy(Employee emp)
	{
		String ausgabe = "";
		if(emp.getSubordinates().isEmpty())
		{
			ausgabe = "- " + emp.getRole() + " [" + emp.getName() + "]" +"\n";
			return ausgabe;
			
		}
		else
		{
			ausgabe = "+ " + emp.getRole() + " (" + emp.getName() + ")" + "\n";
			for (Employee e : emp.getSubordinates()) 
			{
				ausgabe = ausgabe + processHierarchy(e);
			}
		}
		
		return ausgabe;
	}
	
	public static String processHierarchy(Employee emp, String indent)
	{
		String ausgabe = "";
		
		if(emp.getSubordinates().isEmpty())
		{
			ausgabe = indent + "- " + emp.getRole() + " [" + emp.getName() + "]" +"\n";
			return ausgabe;
			
		}
		else
		{
			ausgabe = indent + "+ " + emp.getRole() + " (" + emp.getName() + ")" + "\n";
			indent = indent + "  ";
			for (Employee e : emp.getSubordinates()) 
			{
				ausgabe = ausgabe + processHierarchy(e, indent);
			}
		}
		
		return ausgabe;
	}

}
