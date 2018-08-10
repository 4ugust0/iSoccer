package iSoccer;

import java.util.Scanner;

import System.MainSystem;

public class main {
	
	public static void main(String[] args) {
		while(true) {
			try {
				System.out.println("=> iSoccer <=");
				System.out.println();
				System.out.println("1 - login");
				System.out.println("2 - sair");
				
				int choosedOption = new Scanner(System.in).nextInt();
				
				switch(choosedOption) {
					case 1:
						MainSystem.getInstance().adminLogin();
						break;
					case 2:
						System.exit(0);
				}
			} catch(Exception e) {
				System.out.println("try again");
			}
		}
	}
}
