package org.student;

import org.department.Department;

public class Student extends Department {

	private void studentName() {
		System.out.println("Student name");
	}
	
	private void studentDept() {
		System.out.println("Student department");
	}
	
	private void studentId() {
		System.out.println("Student ID");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.deptName();
		std.studentDept();
		std.studentId();
		std.studentName();
	}
	
}
