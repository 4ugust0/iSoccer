package iSoccer.Persons.Employees.Team_Workers;

import iSoccer.Persons.Employees.Employee;

public class Driver extends Employee {
	private long cnhNumber;
	
	public Driver(String fullName, String eMail, long cpfNumber, long phoneNumber, double monthlySalary, long cnhNumber) {
		super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
		
		this.setCnhNumber(cnhNumber);
	}

	public long getCnhNumber() {
		return cnhNumber;
	}

	public void setCnhNumber(long cnhNumber) {
		this.cnhNumber = cnhNumber;
	}
}
