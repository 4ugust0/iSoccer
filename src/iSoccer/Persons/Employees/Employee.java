package iSoccer.Persons.Employees;

import iSoccer.Persons.Person;

public class Employee extends Person{
	private double monthlySalary;
	
	public Employee(String fullName, String eMail, long cpfNumber, long phoneNumber, double monthlySalary) {
		super(fullName, eMail, cpfNumber, phoneNumber);
		
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
}
