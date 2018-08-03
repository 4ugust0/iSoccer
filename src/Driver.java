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

	public static void printAttributesRequired(){
		System.out.println("=> You need to type, in order:");
		System.out.println("=> Full name");
		System.out.println("=> Email");
		System.out.println("=> CPF number");
		System.out.println("=> Phone number");
		System.out.println("=> Monthly Salary");
		System.out.println("=> CNH number");
		System.out.println();
	}

	public void printItself(){
		System.out.print("Full Name: ");
		System.out.println(this.getFullName());
		System.out.print("Email: ");
		System.out.println(this.getEMail());
		System.out.print("CPF Number: ");
		System.out.println(this.getCpfNumber());
		System.out.print("Phone Number: ");
		System.out.println(this.getPhoneNumber());
		System.out.print("Monthly Salary: ");
		System.out.println(this.getMonthlySalary());
		System.out.print("CNH Number: ");
		System.out.println(this.getCnhNumber());
	}
}