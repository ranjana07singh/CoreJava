package com.cjc2;

import com.mini.project.Employee;
import com.mini.project.EmployeeOperation;

import java.util.*;
public class OperationOnMethod {
	public static void main(String[] args) {
		EmployeeOperation db= new EmployeeOperation();
		
		DatabaseOperation d= new DatabaseOperation();
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1.InsertEmployee\n 2.GetEmployee\n 3.UpdateEmployee\n 4. DeleteEmployee");
			System.out.println("enter choice");
			int ch=sc.nextInt();
		switch (ch) {
		case 1:
			Employee emp =db .setEmployee();
			d.insertdata(emp);
			break;
		case 2:
			Employee em = db.getemployeeDtails();
			d.getEmployeeDetails(em);
			break;
		case 3:
			Employee empp = db.updateEmployee();
			d.UpdateData(empp);
			break;
		case 4:
			Employee ep=db.deleteEmployee();
			d.deleteEmployee(ep);
			break;
		case 5:
			System.out.println("out from Menu");
			System.exit(0);
			break;
		default:
			System.out.println("choices in not valid");
			break;
		}	
		}
		
		
		
		
	}
	
	

}
