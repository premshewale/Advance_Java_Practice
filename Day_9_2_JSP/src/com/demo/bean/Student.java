package com.demo.bean;

public class Student {
	private int rollno;
	private String sname;
	private double percentage;
	
	public Student(int rollno, String sname, double percentage) {
		this.rollno = rollno;
		this.sname = sname;
		this.percentage = percentage;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", percentage=" + percentage + "]";
	}
	
	

	
}
