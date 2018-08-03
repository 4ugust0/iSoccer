import java.util.Scanner;

public class ISoccer{
	private static String adminUsername = "jose";
	private static String adminPassword = "augusto";
	private static int attemptCounter = 0;

	public static boolean LoginInTheSystem(String attemptUsername, String attemptPassword){
		if(attemptUsername.equals(adminUsername) && attemptPassword.equals(adminPassword)){
			return true;
		} else {
			attemptCounter++;
			if(attemptCounter == 3){
				System.out.println();
				System.out.println("=> Username or Password wrong for the third time. Program will exit.");
				new Scanner(System.in).nextLine();
				System.exit(0);
			}

			return false;
		}
	}

	public static void main(String[] args){
		String attemptUsername, attemptPassword;

		while(true) {
			try {
				System.out.println("=> ISoccer system");
				System.out.println("=> type your Username, then type your Password.");

				attemptUsername = new Scanner(System.in).nextLine();
				attemptPassword = new Scanner(System.in).nextLine();

				if(LoginInTheSystem(attemptUsername, attemptPassword)){
					System.out.println("=> Congratulations, you've logged in the system.");
					new Scanner(System.in).nextLine();

					ManageSystem.MainSystem(attemptUsername, attemptUsername);

					System.exit(0);
				} else {
					System.out.println("=> Can't login, invalide Username or Password.");
				}
			} catch(Exception e) {
				System.out.println("=> Invalid input. Try again.");
			}
		}
	}
}