package com.mini.project;


import java.util.Scanner;

import com.cjc2.DatabaseOperation;

public class EmployeeOperation {
	Scanner sc = new Scanner(System.in);
	
	public  Employee setEmployee(){
		Employee emp = new Employee();
		
		System.out.println("enter id");
		emp.setId(sc.nextInt());
		System.out.println("enter name");
		emp.setName(sc.next());
		System.out.println("enter Address");
		emp.setAddress(sc.next());
		System.out.println("enter salary");
		emp.setSalary(sc.next());
		
		return emp;
	}

	public Employee getemployeeDtails(){
		Employee emp = new Employee();
		System.out.println("enter employee id:");
		int empId=sc.nextInt();
		emp.setId(empId);
		return emp;
	}
	public Employee updateEmployee(){
		Employee emp = new Employee();
		DatabaseOperation db= new DatabaseOperation();
		 System.out.println("Enter employee ID: ");
		 int empId = sc.nextInt();
		  emp.setId(empId);
		  
		 System.out.println("1.Update Employee Name: ");
		  System.out.println("2.Update Employee Address:  ");
		  System.out.println("3.Update Employee salary: ");
		  System.out.println("4.For Exit");
		  
		  System.out.println("Which employee details you want to update:");
		  int ch =sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("enter Employee Name:");
			String name = sc.next();
			emp.setName(name);
			break;
		case 2:
			System.out.println("enter employee Address: ");
			String address = sc.next();
			emp.setAddress(address);
			break;
		case 3:
			System.out.println("enter employee Salary");
			String salary = sc.next();
			emp.setSalary(salary);
			break;
		case 4:
			System.out.println("Your are Out from Menu");
			System.exit(0);
			break;
		default:
			System.out.println("Choices not available");
		}
		return emp;
	}
	
	public Employee deleteEmployee(){
		Employee emp = new Employee();
		 System.out.println("Enter employee ID: ");
		 int empId = sc.nextInt();
		  emp.setId(empId);
		  
		return emp;
	}
}
