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
				System.out.println("Username or Password wrong for the third time. Program will exit.");
				new Scanner(System.in).nextLine();
				System.exit(0);
			}

			return false;
		}
	}

	public static void main(String[] args){
		
	}
}