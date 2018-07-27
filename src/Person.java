public class Person{
	private String fullName;
	private String eMail;
	private String cpfNumber;
	private String phoneNumber;

	public String getFullName() {
	    return fullName;
	}

	public void setFullName(String fullName) {
	    this.fullName = fullName;
	}

	public String getEMail() {
	    return eMail;
	}

	public void setEMail(String eMail) {
	    this.eMail = eMail;
	}

	public String getCpfNumber() {
	    return cpfNumber;
	}

	public void setCpfNumber(String cpfNumber) {
	    this.cpfNumber = cpfNumber;
	}

	public String getPhoneNumber() {
	    return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	}

	public Person(String fullName, String eMail, String cpfNumber, String phoneNumber){
		this.fullName = fullName;
		this.eMail = eMail;
		this.cpfNumber = cpfNumber;
		this.phoneNumber = phoneNumber;
	}
}