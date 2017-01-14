import java.util.ArrayList;

public class Employee {
	
	private int empNumber;
	private String name; 
	private double salary;
	private String department;
	private String role;
	private Employee superior;
	private ArrayList<Employee> subordinates = new ArrayList<Employee>();
	
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [getSalary()=" + getSalary() + ", getDepartment()=" + getDepartment() + ", getEmpNumber()="
				+ getEmpNumber() + ", getName()=" + getName() + "]";
	}
	public Employee(int empNumber, String name, double salary, String department) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public Employee(int empNumber, String name, double salary, String department, String role) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.role = role;
	}
	public Employee getSuperior() {
		return superior;
	}
	public void setSuperior(Employee superior) {
		this.superior = superior;
	}
	public ArrayList<Employee> getSubordinates() {
		return subordinates;
	}
	public void setSubordinates(ArrayList<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public String getName() {
		return name;
	}
	public void add(Employee emp)
	{
		subordinates.add(emp);
	}
	public Employee(int empNumber, String name, double salary, String department, String role, Employee superior) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.role = role;
		this.superior = superior;
	}
	
	

}
