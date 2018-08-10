package iSoccer.Persons.Employees.Team_Workers;

import iSoccer.Persons.Employees.Employee;

public class Doctor extends Employee {
	private long crmNumber;
	
	public Doctor(String fullName, String eMail, long cpfNumber, long phoneNumber, double monthlySalary, long crmNumber) {
		super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
		
		this.setCrmNumber(crmNumber);
	}

	public long getCrmNumber() {
		return crmNumber;
	}

	public void setCrmNumber(long crmNumber) {
		this.crmNumber = crmNumber;
	}
}
