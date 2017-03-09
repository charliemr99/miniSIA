package DataLayer;

import java.util.List;


public class Course {
	private int code;
	private String name;
	private String sort;
	private int creditsValue;
	private List<Student> Studentlist;
	private List<Group> currentGroup;
	private List<Teacher> Teacherlist;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public int getCreditsValue() {
		return creditsValue;
	}
	public void setCreditsValue(int creditsValue) {
		this.creditsValue = creditsValue;
	}
	public List<Student> getStudentlist() {
		return Studentlist;
	}
	public void setStudentlist(List<Student> studentlist) {
		Studentlist = studentlist;
	}
	public List<Group> getCurrentGroup() {
		return currentGroup;
	}
	public void setCurrentGroup(List<Group> currentGroup) {
		this.currentGroup = currentGroup;
	}
	public List<Teacher> getTeacherlist() {
		return Teacherlist;
	}
	public void setTeacherlist(List<Teacher> teacherlist) {
		Teacherlist = teacherlist;
	}

}
