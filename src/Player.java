public class Player extends Employee{
	private String playerType;
	private String playerCondition;

	public String getPlayerType() {
	    return playerType;
	}

	public void setPlayerType(String playerType) {
	    this.playerType = playerType;
	}

	public String getPlayerCondition() {
	    return playerCondition;
	}

	public void setPlayerCondition(String playerCondition) {
	    this.playerCondition = playerCondition;
	}

	public Player(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String playerType, String playerCondition){
		super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
		this.playerType = playerType;
		this.playerCondition = playerCondition;
	}

	public static void printAttributesRequired(){
		System.out.println("=> You need to type, in order:");
		System.out.println("=> Full name");
		System.out.println("=> Email");
		System.out.println("=> CPF number");
		System.out.println("=> Phone number");
		System.out.println("=> Monthly Salary");
		System.out.println("=> Player type");
		System.out.println("(HOLDING-MIDFIELDER, DEFENDER, MIDFIELDER, GOALKEEPER, STRIKER, RIGHT-BACK, LEFT-BACK)");
		System.out.println("=> Player condition");
		System.out.println("(GOOD, BAD)");
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
		System.out.print("Player Type: ");
		System.out.println(this.getPlayerType());
		System.out.print("Player Condition: ");
		System.out.println(this.getPlayerCondition());
	}
}