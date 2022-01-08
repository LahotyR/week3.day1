package org.system;

public class Student {

	protected void getStudentInfo(int id) {
		System.out.println("Student ID is: " + id);
	}
	
	protected void getStudentInfo(int id, String name) {
		System.out.println("Student ID is: " + id + " and name is: " + name);
	}
	
	protected void getStudentInfo(String email, long phone) {
		System.out.println("Student email and phone is: " + email + " " + phone);
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.getStudentInfo(95);
		std.getStudentInfo(95, "Rinky");
		std.getStudentInfo("rinky.test@yopmail.com", 1223234459l);
	}
}
