package iSoccer.Persons.Employees.Team_Workers;

import iSoccer.Persons.Employees.Employee;

public class Player extends Employee {
	private int playerType;
	private boolean isAble;
	
	public Player(String fullName, String eMail, long cpfNumber, long phoneNumber, double monthlySalary, int playerType) {
		super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
		
		this.setPlayerType(playerType);
		this.setAble(true);
	}

	public int getPlayerType() {
		return playerType;
	}

	public void setPlayerType(int playerType) {
		this.playerType = playerType;
	}

	public boolean isAble() {
		return isAble;
	}

	public void setAble(boolean isAble) {
		this.isAble = isAble;
	}
}
