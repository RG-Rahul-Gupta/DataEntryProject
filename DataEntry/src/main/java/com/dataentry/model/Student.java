package com.dataentry.model;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String branch;
	private LinkedHashMap <String,String> branches;
	private String activity;
	private String[] attenders;
	
	public Student() {
		
		branches = new LinkedHashMap<>();
		branches.put("CE", "Civil Engineering");
		branches.put("ME", "Mechanical Engineering");
		branches.put("IT", "Information Teachnology");
		branches.put("CS", "Computer Science");
		branches.put("EE", "Electrical Engineering");
	}
	
	
	public Student(String firstName, String lastName, String branch, LinkedHashMap<String, String> branches,
			String activity, String[] attenders) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		this.branches = branches;
		this.activity = activity;
		this.attenders = attenders;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public LinkedHashMap<String, String> getBranches() {
		return branches;
	}
	public void setBranches(LinkedHashMap<String, String> branches) {
		this.branches = branches;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String[] getAttenders() {
		return attenders;
	}
	public void setAttenders(String[] attenders) {
		this.attenders = attenders;
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", branch=" + branch + ", branches="
				+ branches + ", activity=" + activity + ", attenders=" + Arrays.toString(attenders) + "]";
	}
	
	
	

}
