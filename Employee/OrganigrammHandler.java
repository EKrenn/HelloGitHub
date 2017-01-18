
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
	
	// Counter, der die Anzahl der Stufen aufruft
	public static String getChainOfCommandCount(Employee employee, int counter)
	{
		String ausgabe = employee.getName() + " [" + employee.getRole() + "]";
		
		if(employee.getSuperior() == null)
		{
			return ausgabe + " || Anzahl der Vorgesetzten: " + counter;
		}
		
		return ausgabe + " -> " + getChainOfCommandCount(employee.getSuperior(), counter+1);
	}
	
	public static String processHierarchy(Employee emp)
	{
		// Wenn es keinen Nachgestellten (subordinates) gibt...
		// Abfrage muss auf .size == 0 lauten, da das eine ArrayList ist
		// ArrayList == null geht nicht, da es kein String ist
		if(emp.getSubordinates().isEmpty())
		{
			return "- " + emp.getRole() + " [" + emp.getName() + "]\n";
		}
		// Wenn es nicht der Basisfall ist, dann hat der Employee einen "Untergebenen"
		String ausgabe = "+ " + emp.getRole() + " (" + emp.getName() + ")\n";
		
		// geht die Liste der Subortinates durch und schaut nach, wie viele Subortinates es gibt
		for(Employee e : emp.getSubordinates())
		{
			//Ausgabe-String = Ausgabe + der Rekursion, da nicht bekannt ist, ob es weitere
			// Subordinates gibt, oder nicht
			ausgabe += processHierarchy(e);
		}
		return ausgabe; 
	}

}
