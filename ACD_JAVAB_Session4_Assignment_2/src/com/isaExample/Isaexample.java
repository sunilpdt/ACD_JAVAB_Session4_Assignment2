package com.isaExample;

import java.util.Scanner;

import com.acadgild.Employee;

public class Isaexample {

	public static void main(String[] args) {
		
		/*
		 * Below we are showing IS-A relationship between Employee and Person
		 * Employee IS-A Person
		 */
		Employee emp=new Employee();
		
		System.out.println("Enter employee age:");
		Scanner scanAge=new Scanner(System.in);
		emp.setAge(scanAge.nextInt());
		
		System.out.println("Enter employee birthdate:");
		Scanner scanDob=new Scanner(System.in);
		emp.setDob(scanDob.next());
		
		System.out.println("Enter employee name:");
		Scanner scanName=new Scanner(System.in);
		emp.setName(scanName.next());
		
		System.out.println("Enter employee employer name:");
		Scanner scanEmployer=new Scanner(System.in);
		emp.setEmployer(scanEmployer.next());
		
		System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getDob()+" "+emp.getEmployer());

	}

}
