package org.student;

import org.department.Department;

public class Student extends Department {
	
public void studentName() {
	System.out.println("student name");
}
public void	studentDept() {
System.out.println("student dept");	
}

public void studentId() {
	System.out.println("student id");
}
public static void main(String[] args) {
	Student stu=new Student();
	stu.collegeCode();
	stu.collegeName();
	stu.collegeRank();
	stu.deptName();
	stu.studentDept();
	stu.studentId();
	stu.studentName();

	
}

}
