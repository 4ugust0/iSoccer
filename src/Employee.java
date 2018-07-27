public class Employee extends Person{
	private double monthlySalary;

	public double getMonthlySalary() {
	    return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
	    this.monthlySalary = monthlySalary;
	}

	public Employee(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary){
		super(fullName, eMail, cpfNumber, phoneNumber);
		this.monthlySalary = monthlySalary;
	}
}