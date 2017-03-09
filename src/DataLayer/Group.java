package DataLayer;

import java.util.List;

public class Group {

private int number;
private String[] daysOfWeek;
private String[] timesOfWeek;
private String semester;
private Teacher assignedTeacher;
private List<Grade> currentGrade;


public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String[] getDaysOfWeek() {
	return daysOfWeek;
}
public void setDaysOfWeek(String[] daysOfWeek) {
	this.daysOfWeek = daysOfWeek;
}
public String[] getTimesOfWeek() {
	return timesOfWeek;
}
public void setTimesOfWeek(String[] timesOfWeek) {
	this.timesOfWeek = timesOfWeek;
}
public String getSemester() {
	return semester;
}
public void setSemester(String semester) {
	this.semester = semester;
}
public Teacher getAssignedTeacher() {
	return assignedTeacher;
}
public void setAssignedTeacher(Teacher assignedTeacher) {
	this.assignedTeacher = assignedTeacher;
}
public List<Grade> getCurrentGrade() {
	return currentGrade;
}
public void setCurrentGrade(List<Grade> currentGrade) {
	this.currentGrade = currentGrade;
}

}
