import java.util.Scanner;
import java.util.ArrayList;

public class SystemAttributes{
	private ArrayList<President> presidentList;
	private ArrayList<Doctor> doctorList;
	private ArrayList<Coach> coachList;
	private ArrayList<PersonalTrainer> personalTrainerList;
	private ArrayList<Driver> driverList;
	private ArrayList<Cooker> cookerList;
	private ArrayList<Lawyer> lawyerList;
	private ArrayList<Player> playerList;
	private ArrayList<Supporter> supporterList = new ArrayList<Supporter>();

	private double juniorValue;
	private double seniorValue;
	private double eliteValue;

	private void printPresident(){
		for(President aPresident : this.presidentList){
			aPresident.printItself();
			System.out.println();
		}
	}

	private void printDoctor(){
		for(Doctor aDoctor : this.doctorList){
			aDoctor.printItself();
			System.out.println();
		}
	}

	private void printCoach(){
		for(Coach aCoach : this.coachList){
			aCoach.printItself();
			System.out.println();
		}
	}

	private void printPersonalTrainer(){
		for(PersonalTrainer aPersonalTrainer : this.personalTrainerList){
			aPersonalTrainer.printItself();
			System.out.println();
		}
	}

	private void printDriver(){
		for(Driver aDriver : this.driverList){
			aDriver.printItself();
			System.out.println();
		}
	}

	private void printCooker(){
		for(Cooker aCooker : this.cookerList){
			aCooker.printItself();
			System.out.println();
		}
	}

	private void printLawyer(){
		for(Lawyer aLawyer : this.lawyerList){
			aLawyer.printItself();
			System.out.println();
		}
	}

	private void printPlayer(){
		for(Player aPlayer : this.playerList){
			aPlayer.printItself();
			System.out.println();
		}
	}

	private void printSupporter(){
		for(Supporter aSupporter : this.supporterList){
			aSupporter.printItself();
			System.out.println();
		}
	}

	private double getJuniorValue(){
		return this.juniorValue;
	}

	private void setJuniorValue(Double juniorValue){
		this.juniorValue = juniorValue;
	}

	private double getSeniorValue(){
		return this.seniorValue;
	}

	private void setSeniorValue(Double seniorValue){
		this.seniorValue = seniorValue;
	}

	private double getEliteValue(){
		return this.eliteValue;
	}

	private void setEliteValue(Double eliteValue){
		this.eliteValue = eliteValue;
	}

	public SystemAttributes(){
		this.presidentList = new ArrayList<President>();
		this.doctorList = new ArrayList<Doctor>();
		this.coachList = new ArrayList<Coach>();
		this.personalTrainerList = new ArrayList<PersonalTrainer>();
		this.driverList = new ArrayList<Driver>();
		this.cookerList = new ArrayList<Cooker>();
		this.lawyerList = new ArrayList<Lawyer>();
		this.playerList = new ArrayList<Player>();
		this.supporterList = new ArrayList<Supporter>();

		this.setJuniorValue(1000.0);
		this.setSeniorValue(2000.0);
		this.setEliteValue(3000.0);
	}

	public void updateContributionValueAssociated(){
		try{
			System.out.println("=> Update contribution value associated");
			System.out.println("=> type the junior value, senior value and elite value, in order");

			double juniorValue = new Scanner(System.in).nextDouble();
			double seniorValue = new Scanner(System.in).nextDouble();
			double eliteValue = new Scanner(System.in).nextDouble();

			this.setJuniorValue(juniorValue);
			this.setSeniorValue(seniorValue);
			this.setEliteValue(eliteValue);

			for(Supporter aSupporter : this.supporterList){
				aSupporter.updateSupporterType(this.getJuniorValue(), this.getSeniorValue(), this.getEliteValue());
			}

		} catch(Exception e){
			System.out.println("=> Type a valid option.");
		}
	}

	public void changePaymentStatus(){
		try{
			System.out.println();
			System.out.println("=> Change payment status");
			System.out.println();

			Supporter.printRequiredAttributesToChangePaymentStatus();

			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String newPaymentStatus = new Scanner(System.in).nextLine();

			String[] allStatus = {"DEFAULTER", "DEFAULTING"};

			boolean validStatus = false;

			for(String aString : allStatus){
				if(aString.equals(newPaymentStatus)){
					validStatus = true;
					break;
				}
			}

			if(validStatus){
				boolean successfulyChanged = false;

				for(Supporter aSupporter : this.supporterList){
					if(aSupporter.getCpfNumber().equals(cpfNumber)){
						aSupporter.setPaymentStatus(newPaymentStatus);
						successfulyChanged = true;
						break;
					}
				}

				if(successfulyChanged){
					System.out.println("=> Payment status changed successfuly.");
				} else {
					System.out.println("=> Wrong cpf number");
				}

			} else {
				System.out.println("=> Type a valid status.");
			}
		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}

	public void addPresident(){
		try{
			System.out.println();
			System.out.println("=> Add president");
			System.out.println();

			President.printAttributesRequired();

			String fullName = new Scanner(System.in).nextLine();
			String eMail = new Scanner(System.in).nextLine();
			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String phoneNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			Double monthlySalary = new Scanner(System.in).nextDouble();

			President newPresidentOBJ = new President(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
			this.presidentList.add(newPresidentOBJ);

			System.out.println("=> Presindet added successfuly.");

		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}

	public void addDoctor(){
		try{
			System.out.println();
			System.out.println("=> Add doctor");
			System.out.println();

			Doctor.printAttributesRequired();

			String fullName = new Scanner(System.in).nextLine();
			String eMail = new Scanner(System.in).nextLine();
			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String phoneNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			Double monthlySalary = new Scanner(System.in).nextDouble();
			String crmNumber = Integer.parseInt(new Scanner(System.in).next()) + "";

			Doctor newDoctorOBJ = new Doctor(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, crmNumber);
			this.doctorList.add(newDoctorOBJ);

			System.out.println("=> Doctor added successfuly.");

		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}

	public void addCoach(){
		try{
			System.out.println();
			System.out.println("=> Add coach");
			System.out.println();

			Coach.printAttributesRequired();

			String fullName = new Scanner(System.in).nextLine();
			String eMail = new Scanner(System.in).nextLine();
			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String phoneNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			Double monthlySalary = new Scanner(System.in).nextDouble();

			Coach newCoachOBJ = new Coach(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
			this.coachList.add(newCoachOBJ);

			System.out.println("=> Coach added successfuly.");

		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}

	public void addPersonalTrainer(){
		try{
			System.out.println();
			System.out.println("=> Add personal trainer");
			System.out.println();

			PersonalTrainer.printAttributesRequired();

			String fullName = new Scanner(System.in).nextLine();
			String eMail = new Scanner(System.in).nextLine();
			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String phoneNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			Double monthlySalary = new Scanner(System.in).nextDouble();

			PersonalTrainer newPersonalTrainerOBJ = new PersonalTrainer(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
			this.personalTrainerList.add(newPersonalTrainerOBJ);

			System.out.println("=> Personal Trainer added successfuly.");

		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}

	public void addDriver(){
		try{
			System.out.println();
			System.out.println("=> Add driver");
			System.out.println();

			Driver.printAttributesRequired();

			String fullName = new Scanner(System.in).nextLine();
			String eMail = new Scanner(System.in).nextLine();
			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String phoneNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			Double monthlySalary = new Scanner(System.in).nextDouble();
			String cnhNumber = Integer.parseInt(new Scanner(System.in).next()) + "";

			Driver newDriverOBJ = new Driver(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, cnhNumber);
			this.driverList.add(newDriverOBJ);

			System.out.println("=> Driver added successfuly.");

		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}

	public void addCooker(){
		try{
			System.out.println();
			System.out.println("=> Add cooker");
			System.out.println();

			Cooker.printAttributesRequired();

			String fullName = new Scanner(System.in).nextLine();
			String eMail = new Scanner(System.in).nextLine();
			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String phoneNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			Double monthlySalary = new Scanner(System.in).nextDouble();

			Cooker newCookerOBJ = new Cooker(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
			this.cookerList.add(newCookerOBJ);

			System.out.println("=> Cooker added successfuly.");

		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}

	public void addLawyer(){
		try{
			System.out.println();
			System.out.println("=> Add lawyer");
			System.out.println();

			Lawyer.printAttributesRequired();

			String fullName = new Scanner(System.in).nextLine();
			String eMail = new Scanner(System.in).nextLine();
			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String phoneNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			Double monthlySalary = new Scanner(System.in).nextDouble();

			Lawyer newLawyerOBJ = new Lawyer(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
			this.lawyerList.add(newLawyerOBJ);

			System.out.println("=> Lawyer added successfuly.");

		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}

	public void addPlayer(){
		try{
			System.out.println();
			System.out.println("=> Add player");
			System.out.println();

			Player.printAttributesRequired();

			String fullName = new Scanner(System.in).nextLine();
			String eMail = new Scanner(System.in).nextLine();
			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String phoneNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			Double monthlySalary = new Scanner(System.in).nextDouble();
			String playerType = new Scanner(System.in).nextLine();
			String playerCondition = new Scanner(System.in).nextLine();

			String[] playerTypes = {"HOLDING-MIDFIELDER", "DEFENDER", "MIDFIELDER", "GOALKEEPER", "STRIKER", 
										"RIGHT-BACK", "LEFT-BACK"};
			String[] playerConditions = {"GOOD", "BAD"};

			boolean validType = false;
			boolean validCondition = false;

			for(String aString : playerTypes){
				if(aString.equals(playerType)){
					validType = true;
					break;
				}
			}

			for(String aString : playerConditions){
				if(aString.equals(playerCondition)){
					validCondition = true;
					break;
				}
			}

			if(validType && validCondition){
				Player newPlayerOBJ = new Player(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, playerType, playerCondition);
				this.playerList.add(newPlayerOBJ);

				System.out.println("=> Player added successfuly.");
				System.out.println();
			} else {
				return;
			}

		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}

	public void addSupporter(){
		try{
			System.out.println();
			System.out.println("=> Add supporter");
			System.out.println();

			Supporter.printAttributesRequired();

			String fullName = new Scanner(System.in).nextLine();
			String eMail = new Scanner(System.in).nextLine();
			String cpfNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			String phoneNumber = Integer.parseInt(new Scanner(System.in).next()) + "";
			Double contributionValue = new Scanner(System.in).nextDouble();

			Supporter newSupporterOBJ = new Supporter(fullName, eMail, cpfNumber, phoneNumber, contributionValue);
			newSupporterOBJ.updateSupporterType(this.juniorValue, this.seniorValue, this.eliteValue);
			this.supporterList.add(newSupporterOBJ);

			System.out.println("=> Supporter added successfuly.");

		} catch(Exception e) {
			System.out.println("=> Type valid entries.");
		}
	}
}