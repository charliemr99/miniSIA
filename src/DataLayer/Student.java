package DataLayer;

import java.util.Date;
import java.util.List;

public class Student {

		private int id;
		private String name;
		private String lastName;
		private int TIUN;
		private boolean pincture;
		private Date birthDate;
		private String preGradeProgram;
		private int currentPeriod;
		private double POTATO;
		private double PA;
		private int careerProgress;
		private Advisor assignedAdvisor;
		private int creditsBag;
		private int totalCredits;
		private int currentCredits;
		private int approvedCredits;
		private int forfeitCredits;
		private double debts;
		private List<Course> currentCurses;


public int getId () {
		return this.id;
	}
	
public void setId (int id) {
		this.id = id;
	}

public String getName() {
		return name;
	}

public void setName(String name) {
		this.name = name;
	}

public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

public int getTIUN() {
		return TIUN;
	}

public void setTIUN(int TIUN) {
		this.TIUN = TIUN;
	}

public boolean isPincture() {
		return pincture;
	}

public void setPincture(boolean pincture) {
		this.pincture = pincture;
	}

public Date getBirthDate() {
		return birthDate;
	}

public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

public String getPreGradeProgram() {
		return preGradeProgram;
	}

public void setPreGradeProgram(String preGradeProgram) {
		this.preGradeProgram = preGradeProgram;
	}

public int getCurrentPeriod() {
		return currentPeriod;
	}

public void setCurrentPeriod(int currentPeriod) {
		this.currentPeriod = currentPeriod;
	}

public double getPOTATO() {
		return POTATO;
	}

public void setPOTATO(double POTATO) {
		this.POTATO = POTATO;
	}

public double getPA() {
		return PA;
	}

public void setPA(double PA) {
		this.PA = PA;
	}

public int getCareerProgress() {
		return careerProgress;
	}

public void setCareerProgress(int careerProgress) {
		this.careerProgress = careerProgress;
	}

public Advisor getAssignedAdvisor() {
		return assignedAdvisor;
	}

public void setAssignedAdvisor(Advisor assignedAdvisor) {
		this.assignedAdvisor = assignedAdvisor;
	}

public int getCreditsBag() {
		return creditsBag;
	}

public void setCreditsBag(int creditsBag) {
		this.creditsBag = creditsBag;
	}

public int getTotalCredits() {
		return totalCredits;
	}

public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public int getCurrentCredits() {
		return currentCredits;
	}

public void setCurrentCredits(int currentCredits) {
		this.currentCredits = currentCredits;
	}

public int getApprovedCredits() {
		return approvedCredits;
	}

public void setApprovedCredits(int approvedCredits) {
		this.approvedCredits = approvedCredits;
    }

public int getForfeitCredits() {
		return forfeitCredits;
	}

public void setForfeitCredits(int forfeitCredits) {
		this.forfeitCredits = forfeitCredits;
	}

public double getDebts() {
		return debts;
	}

public void setDebts(double debts) {
		this.debts = debts;
	}

public List<Course> getCurrentCurses() {
		return currentCurses;
	}

public void setCurrentCurses(List<Course> currentCurses) {
		this.currentCurses = currentCurses;
	}
	
	
	
}
