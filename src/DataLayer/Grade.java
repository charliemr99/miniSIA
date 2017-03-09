package DataLayer;


public class Grade {
	
private String id;
private double value;
private int percentage;
private Course currentCourse;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public double getValue() {
	return value;
}
public void setValue(double value) {
	this.value = value;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
public Course getCurrentCourse() {
	return currentCourse;
}
public void setCurrentCourse(Course currentCourse) {
	this.currentCourse = currentCourse;
}

}
