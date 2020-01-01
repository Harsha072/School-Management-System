package org.school;

import java.util.ArrayList;

//school can have many teachers and many students 
public class School {

	private ArrayList<Student > students1;
	private ArrayList<teachers > teachers1;
	private static int amtEarned=0;
	private static int amtSpent=0;;
	public School(ArrayList<Student> students, ArrayList<org.school.teachers> teachers) {
		
		this.students1 = students;
		this.teachers1 = teachers;
	}
	public ArrayList<Student> getStudents() {
		return students1;
	}
	public void addStudents(Student students) {
		students1.add(students);
	}
	public ArrayList<teachers> getTeachers() {
		return teachers1;
	}
	public void addTeachers(teachers teachers) {
		teachers1.add(teachers);
	}
	public int getAmtEarned() {
		return amtEarned;
	}
	//amount earned by school from students fees
	public static void updateAmtEarned(int amtEarned) {
		School.amtEarned = School.amtEarned+amtEarned;
	}
	public int getAmtSpent() {
		return amtSpent;
	}
	//amount given to the teachers by the school as salary
	public static void setAmtSpent(int amtSpent) {
		amtEarned=amtEarned-amtSpent;
	}
	
	
	
	
}
