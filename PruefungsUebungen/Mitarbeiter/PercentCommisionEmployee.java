package Mitarbeiter;

public class PercentCommisionEmployee extends Employee {
	
	protected double percentCommission;

	public PercentCommisionEmployee(String lastname, String firstname, String department, double baseSalary) {
		super(lastname, firstname, department, baseSalary);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getPercentCommission() {
		return percentCommission;
	}



	public void setPercentCommission(double percentCommission) {
		this.percentCommission = (baseSalary / 100) * percentCommission;
	}


	@Override
	public double getFullSalary()
	{
		double sal = baseSalary + getPercentCommission();
		return sal;
	}

}
