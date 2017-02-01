package Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	

	public double calcTotalSalary()
	{
		double newSalary = 0.0;
		for(Employee e : employees)
		{
			newSalary = newSalary + e.getFullSalary();
		}
		return newSalary;
	}
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	
	public HashMap<String, Double> getSalaryByDepartment()
	{
		HashMap<String, Double> salary = new HashMap<>();
		
		for (Employee employee : employees) 
		{
			if(salary.containsKey(employee.getDepartment()))
			{
				double currentSalary = salary.get(employee.getDepartment());
				currentSalary = currentSalary + employee.getFullSalary();
				
				salary.put(employee.getDepartment(), currentSalary);
			}
			else
			{
				salary.put(employee.getDepartment(), employee.getFullSalary());
			}
		}
			return salary;
	}

}
