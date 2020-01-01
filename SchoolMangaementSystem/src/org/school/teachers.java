package org.school;

public class teachers {

	private int id;
	private String  name;
	private int sal;
	private int salEarned;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public teachers(int id, String name, int sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.salEarned=0;
	}
	
	public void recieveSal(int sal){
		salEarned+=sal;
		School.setAmtSpent(salEarned);
	}
	@Override
	public String toString() {
		return name + "  has earned  " + salEarned ;
	}
	
	
}
