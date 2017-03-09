package DataLayer;
import java.util.Date;
import java.util.List;

public class Teacher {
private int id;
private String name;
private String lastName;
private int TIUN;
private boolean picture;
private Date birthDate;
private List<Course> currentCourse;
public int getId() {
	return id;
}
public void setId(int id) {
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
public boolean isPicture() {
	return picture;
}
public void setPicture(boolean picture) {
	this.picture = picture;
}
public Date getBirthDate() {
	return birthDate;
}
public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}
public List<Course> getCurrentCourse() {
	return currentCourse;
}
public void setCurrentCourse(List<Course> currentCourse) {
	this.currentCourse = currentCourse;
}

}

