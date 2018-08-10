package iSoccer.Persons;

import java.util.Scanner;

public class Person {
	private String fullName;
	private String eMail;
	private long cpfNumber;
	private long phoneNumber;
	
	public Person(String fullName, String eMail, long cpfNumber, long phoneNumber) {
		this.setFullName(fullName);
		this.seteMail(eMail);
		this.setCpfNumber(cpfNumber);
		this.setPhoneNumber(phoneNumber);
	}

	public static String readFullName() {
		System.out.println("=> Digite o nome completo: ");
		String currentString = new Scanner(System.in).nextLine();
		return currentString;
	}
	
	public static String readeMail() {
		System.out.println("=> Digite o nome completo: ");
		String currentString = new Scanner(System.in).nextLine();
		return currentString;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public long getCpfNumber() {
		return cpfNumber;
	}

	public void setCpfNumber(long cpfNumber) {
		this.cpfNumber = cpfNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
