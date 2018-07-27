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

	public Supporter(String fullName, String eMail, String cpfNumber, String phoneNumber, double contributionValue, String paymentStatus, String supporterType){
		super(fullName, eMail, cpfNumber, phoneNumber);
		this.contributionValue = contributionValue;
		this.paymentStatus = paymentStatus;
		this.supporterType = supporterType;
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
}