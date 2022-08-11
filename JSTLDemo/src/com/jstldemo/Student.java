package com.jstldemo;

public class Student {
	int rollname;
	String name;
	
	
	public Student(int rollname, String name) {
		super();
		this.rollname = rollname;
		this.name = name;
	}


	public int getRollname() {
		return rollname;
	}


	public void setRollname(int rollname) {
		this.rollname = rollname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollname=" + rollname + ", name=" + name + "]";
	}
	
	
	
}
