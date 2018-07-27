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
}