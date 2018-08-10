package Team_Attributes;

import java.util.ArrayList;

import iSoccer.Persons.Employees.Team_Workers.Coach;
import iSoccer.Persons.Employees.Team_Workers.Cooker;
import iSoccer.Persons.Employees.Team_Workers.Doctor;
import iSoccer.Persons.Employees.Team_Workers.Driver;
import iSoccer.Persons.Employees.Team_Workers.Lawyer;
import iSoccer.Persons.Employees.Team_Workers.Personal;
import iSoccer.Persons.Employees.Team_Workers.Player;
import iSoccer.Persons.Employees.Team_Workers.President;
import iSoccer.Persons.Non_Employees.Supporter;

public class Attributes {
	private static Attributes singleInstance = null;
	
	private ArrayList<Coach> coachList;
	private ArrayList<Cooker> cookerList;
	private ArrayList<Doctor> doctorList;
	private ArrayList<Driver> driverList;
	private ArrayList<Lawyer> lawyerList;
	private ArrayList<Personal> personalList;
	private ArrayList<Player> playerList;
	private ArrayList<President> presidentList;
	private ArrayList<Supporter> supporterList;
	
	private Attributes() {
		this.coachList = new ArrayList<Coach>();
		this.cookerList = new ArrayList<Cooker>();
		this.doctorList = new ArrayList<Doctor>();
		this.driverList = new ArrayList<Driver>();
		this.lawyerList = new ArrayList<Lawyer>();
		this.personalList = new ArrayList<Personal>();
		this.playerList = new ArrayList<Player>();
		this.presidentList = new ArrayList<President>();
		this.supporterList = new ArrayList<Supporter>();
	}
	
	public static Attributes getInstance() {
		if(singleInstance == null) {
			singleInstance = new Attributes();
		}
		
		return singleInstance;
	}
}
