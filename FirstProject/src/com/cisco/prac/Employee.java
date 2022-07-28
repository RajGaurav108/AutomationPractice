package com.cisco.prac;

public class Employee {
	String eName;
	int eid;
	String role;
	String dept;
	
	
	
	public Employee() {
		System.out.println("Calling Constructor");
		eid = 0;
	}
	
	public  Employee(int eid,String eName,String role,String dept) {
		System.out.println(eid);
//		eName = Name;
		this.eName = eName;
		System.out.println(eName);
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}


	
}
