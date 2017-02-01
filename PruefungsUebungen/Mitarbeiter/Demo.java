package Mitarbeiter;

public class Demo {

	public static void main(String[] args) {
		Employee one = new Employee("Krenn", "Elisabeth", "PR", 2000);
		one.getFullSalary();
		FixCommissionEmployee two = new FixCommissionEmployee("Maier", "Susi", "IT", 3000);
		two.setAdditionalCommission(300.0);
		two.getFullSalary();
		PercentCommisionEmployee three = new PercentCommisionEmployee("Huber", "Hans", "PR", 100);
		three.setPercentCommission(10);
		three.getFullSalary();
		Employee four = new Employee("Bauer", "Hans", "PR", 2500);
		four.getFullSalary();
		
		EmployeeManager em = new EmployeeManager();
		em.addEmployee(one);
		em.addEmployee(two);
		em.addEmployee(three);
		em.addEmployee(four);
		
		System.out.println("TotalSalary: " + em.calcTotalSalary());
		System.out.println(em.getSalaryByDepartment());
		
		

	}

}
