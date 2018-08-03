import java.util.ArrayList;
import java.util.Scanner;

public class ManageSystem{
	private static String adminUsername = "jose";
	private static String adminPassword = "augusto";

	private static SystemAttributes sysAttributes = new SystemAttributes();

	private static boolean stillLogged(String attemptUsername, String attemptPassword){
		if(attemptUsername.equals(adminUsername) && attemptPassword.equals(attemptPassword)){
			return true;
		} else {
			return false;
		}
	}

	private static void addEmployee(){
		while(true){
			try{
				System.out.println();
				System.out.println("=> Add Employee");
				System.out.println();

				System.out.println("=> 0 - President");
				System.out.println("=> 1 - Doctor");
				System.out.println("=> 2 - Coach");
				System.out.println("=> 3 - Personal Trainer");
				System.out.println("=> 4 - Driver");
				System.out.println("=> 5 - Cooker");
				System.out.println("=> 6 - Lawyer");
				System.out.println("=> 7 - Player");
				System.out.println("=> 8 - Exit");

				int choosedOption = Integer.parseInt(new Scanner(System.in).nextLine());

				switch(choosedOption){
					case 0:
						sysAttributes.addPresident();
						break;
					case 1:
						sysAttributes.addDoctor();
						break;
					case 2:
						sysAttributes.addCoach();
						break;
					case 3:
						sysAttributes.addPersonalTrainer();
						break;
					case 4:
						sysAttributes.addDriver();
						break;
					case 5:
						sysAttributes.addCooker();
						break;
					case 6:
						sysAttributes.addLawyer();
						break;
					case 7:
						sysAttributes.addPlayer();
						break;
					case 8:
						return;
				}
			} catch(Exception e){
				System.out.println("=> Type a valid option.");
			}
		}
	}

	public static void manageSupporters(){
		while(true){
			try{
				System.out.println();
				System.out.println("=> Manage supporters");
				System.out.println();

				System.out.println("=> 0 - Add supporter");
				System.out.println("=> 1 - Change payment status");
				System.out.println("=> 2 - Update contribution value associated");
				System.out.println("=> 3 - Exit");

				int choosedOption = Integer.parseInt(new Scanner(System.in).nextLine());

				switch(choosedOption){
					case 0:
						sysAttributes.addSupporter();
						break;
					case 1:
						sysAttributes.changePaymentStatus();
						break;
					case 2:
						sysAttributes.updateContributionValueAssociated();
						break;
					case 3:
						return;
				}
			} catch(Exception e){
				System.out.println("=> Type a valid option.");
			}
		}
	}

	public static void getReports(){
		while(true){
			try{
				if(stillLogged(attemptUsername, attemptPassword)){
					System.out.println();
					System.out.println("=>Get Reports");
					System.out.println();

					System.out.println("=> 0 - Employees");
					System.out.println("=> 1 - Physical Resources");
					System.out.println("=> 2 - Supporters");
					System.out.println("=> 3 - All");
					System.out.println("=> 4 - Exit");

					int choosedOption = Integer.parseInt(new Scanner(System.in).nextLine());

					switch(choosedOption){
						case 0:
							System.out.println("=> Employees Report");
							System.out.println();
							System.out.println("=> Team: ");
							System.out.println("=> Coach: ");
							sysAttributes.printCoach();
							System.out.println();
							System.out.println("=> Player: ");
							sysAttributes.printPlayer();
							System.out.println();
							System.out.println("=> General Services: ");
							System.out.println("=> Cooker: ");
							sysAttributes.printCooker();
							System.out.println();
							System.out.println("=> Doctor: ");
							sysAttributes.printDoctor();
							System.out.println();
							System.out.println("=> Driver: ");
							sysAttributes.printDriver();
							System.out.println();
							System.out.println("=> Lawyer: ");
							sysAttributes.printLawyer();
							System.out.println();
							System.out.println("=> PersonalTrainer: ");
							sysAttributes.printPersonalTrainer();
							System.out.println();
							System.out.println("=> President: ");
							sysAttributes.printPresident();
							System.out.println();

							break;
						case 1:
							//System.out.println("=> Physical Resources Report");
							//System.out.println();
							//sysAttributes.physicalResourcesReport();
							//System.out.println();
							break;
						case 2:
							System.out.println("=> Supporters Report");
							System.out.println();
							System.out.print(sysAttributes.getSizeSupporterList() + " Supporters.");
							System.out.println();
							break;
						case 3:
							System.out.println("=> All Reports");
							System.out.println();
							System.out.println("=> Employees Report");
							System.out.println();
							sysAttributes.employeesReport();
							System.out.println();
							//System.out.println("=> Physical Resources Report");
							//System.out.println();
							//sysAttributes.physicalResourcesReport();
							System.out.println();
							System.out.println("=> Supporters Report");
							System.out.println();
							sysAttributes.supportersReport();
							System.out.println();
							break;
						case 4:
							return;
					}
				} else {
					return;
				}
			} catch(Exception e){
				System.out.println("=> Type a valid option.");
			}
		}
	}

	public static void MainSystem(String attemptUsername, String attemptPassword){
		while(true){
			try{
				if(stillLogged(attemptUsername, attemptPassword)){
					System.out.println();
					System.out.println("=> Main System");
					System.out.println();

					System.out.println("=> 0 - Add an employee");
					System.out.println("=> 1 - Manage supporters");
					System.out.println("=> 2 - Manage resources");
					System.out.println("=> 3 - Get reports");
					System.out.println("=> 4 - Exit");

					int choosedOption = Integer.parseInt(new Scanner(System.in).nextLine());

					switch(choosedOption){
						case 0:
							addEmployee();
							break;
						case 1:
							manageSupporters();
							break;
						case 2:

							break;
						case 3:
							getReports();
							break;
						case 4:
							return;
					}
				} else {
					return;
				}
			} catch(Exception e){
				System.out.println("=> Type a valid option.");
			}
		}
	}
}