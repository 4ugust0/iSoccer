public class Supporter extends Person{
	private double contributionValue;
	private String paymentStatus;
	private String supporterType;

	public double getContributionValue() {
	    return contributionValue;
	}

	public void setContributionValue(double contributionValue) {
	    this.contributionValue = contributionValue;
	}

	public Supporter(String fullName, String eMail, String cpfNumber, String phoneNumber, double contributionValue){
		super(fullName, eMail, cpfNumber, phoneNumber);
		this.contributionValue = contributionValue;
		this.paymentStatus = "DEFAULTER";
	}

	public String getPaymentStatus() {
	    return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
	    this.paymentStatus = paymentStatus;
	}

	public String getSupporterType() {
	    return supporterType;
	}

	public void setSupporterType(String supporterType) {
	    this.supporterType = supporterType;
	}

	public static void printAttributesRequired(){
		System.out.println("=> You need to type, in order:");
		System.out.println("=> Full name");
		System.out.println("=> Email");
		System.out.println("=> CPF number");
		System.out.println("=> Phone number");
		System.out.println("=> Contribution value");
		System.out.println();
	}

	public static void printRequiredAttributesToChangePaymentStatus(){
		System.out.println("=> You need to type, in order:");
		System.out.println("=> CPF");
		System.out.println("=> Payment status");
		System.out.println("(DEFAULTER, DEFAULTING)");
		System.out.println();
	}

	public void updateSupporterType(double juniorValue, double seniorValue, double eliteValue){
		if(this.getContributionValue() <= juniorValue){
			this.setSupporterType("JUNIOR");
		} else if (this.getContributionValue() <= seniorValue){
			this.setSupporterType("SENIOR");
		} else {
			this.setSupporterType("ELITE");
		}
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
		System.out.print("Contribution Value: ");
		System.out.println(this.getContributionValue());
		System.out.print("Payment Status: ");
		System.out.println(this.getPaymentStatus());
		System.out.print("Supporter Type: ");
		System.out.println(this.getSupporterType());
	}
}