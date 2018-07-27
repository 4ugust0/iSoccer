public class Doctor extends Employee{
	private String crmNumber;

	public String getCrmNumber() {
	    return crmNumber;
	}

	public void setCrmNumber(String crmNumber) {
	    this.crmNumber = crmNumber;
	}

	public Doctor(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String crmNumber){
		super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
		this.crmNumber = crmNumber;
	}
}