public class Driver extends Employee{
	private String cnhNumber;

	public String getCnhNumber() {
	    return cnhNumber;
	}

	public void setCnhNumber(String cnhNumber) {
	    this.cnhNumber = cnhNumber;
	}

	public Driver(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String cnhNumber){
		super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
		this.cnhNumber = cnhNumber;
	}
}