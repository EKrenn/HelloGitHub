package Mitarbeiter;

public class FixCommissionEmployee extends Employee {
	
	protected double additionalCommission;

	public FixCommissionEmployee(String lastname, String firstname, String department, double baseSalary) {
		super(lastname, firstname, department, baseSalary);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getAdditionalCommission() {
		return additionalCommission;
	}



	public void setAdditionalCommission(double additionalCommission) {
		this.additionalCommission = additionalCommission;
	}



	@Override
	public double getFullSalary()
	{
		double sal = baseSalary + getAdditionalCommission();
		return sal;
	}
	
	

}
