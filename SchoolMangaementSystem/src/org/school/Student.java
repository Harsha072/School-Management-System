package org.school;

public class Student {
	
	private int id;
	private String name;
	private int grade ;
	private int feesPaid;
	private int feesTotal;
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public void payFees(int feesPaid) {
		this.feesPaid=feesPaid;
		School.updateAmtEarned(feesPaid);
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	public Student(int id, String name, int grade) {
//fees paid by students to the school
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public int getRemainingFee(){
		return feesTotal-feesPaid;
	}
	@Override
	public String toString() {
		return  name +" has paid "+ feesPaid +"";
	}
	

}
