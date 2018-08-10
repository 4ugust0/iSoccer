package System;

import java.util.Scanner;

public class MainSystem {
	private static MainSystem singleInstance = null;
	
	private String adminUsername;
	private String adminPassword;
	
	private MainSystem() {
		this.adminUsername = "jose";
		this.adminPassword = "augusto";
	}
	
	public static MainSystem getInstance() {
		if(singleInstance == null) {
			singleInstance = new MainSystem();
		}
		
		return singleInstance;
	}

	public void adminLogin() {
		try {
			System.out.println("=> iSoccer <=");
			System.out.println();
			
			System.out.print("=> type the admin username: ");
			String attemptUsername = new Scanner(System.in).nextLine();
			
			System.out.print("=> type the admin password: ");
			String attemptPassword = new Scanner(System.in).nextLine();
			
			if(this.getAdminUsername().equals(attemptUsername) && this.getAdminPassword().equals(attemptPassword)) {
				System.out.print("=> logged in the system");
				new Scanner(System.in).nextLine();
				
				this.OptionsMenu();
			} else {
				System.out.println("=> try again");
				new Scanner(System.in).nextLine();
				
				return;
			}
		} catch(Exception e) {
			System.out.println("=> try again");
			new Scanner(System.in).nextLine();
			
			return;
		}
	}

	private void OptionsMenu() {
		while(true) {
			try {
				System.out.println("=> iSoccer <=");
				System.out.println();
				System.out.println("1 - add an employee");
				System.out.println("2 - add a supporter");
				System.out.println("3 - manage physical resources");
				System.out.println("4 - get reports");
				System.out.println("5 - exit");
				
				int choosedOption = new Scanner(System.in).nextInt();
				
				switch(choosedOption) {
					case 1:
						
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					case 5:
						return;
				}
				
			} catch(Exception e) {
				System.out.println("=> try again");
				new Scanner(System.in).nextLine();
			}
		}
	}
	
	private String getAdminUsername() {
		return this.adminUsername;
	}
	
	private String getAdminPassword() {
		return this.adminPassword;
	}
}
