package com.hasaExample;

import java.util.Scanner;

import com.acadgild.Address;
import com.acadgild.Employee;


public class Hasaexample {

	/*
	 * Employee has another Object Address
	 * Employee HAS-A Address 
	 */
	
	public static void main(String[] args) {
	
		Employee emp=new Employee();
		Address address=new Address();
		
		System.out.println("Enter Building name:");
		Scanner scanBldg=new Scanner(System.in);
		address.setBuildName(scanBldg.next());
		
		System.out.println("Enter Block No:");
		Scanner scanBlockno=new Scanner(System.in);
		address.setBuildName(scanBlockno.next());
		
		System.out.println("Enter Street:");
		Scanner scanStreet=new Scanner(System.in);
		address.setStreet(scanStreet.next());
		
		System.out.println("Enter City:");
		Scanner scanCity=new Scanner(System.in);
		address.setCity(scanCity.next());
		
		System.out.println("Enter State:");
		Scanner scanState=new Scanner(System.in);
		address.setState(scanState.next());
		
		System.out.println("Enter Country:");
		Scanner scanCountry=new Scanner(System.in);
		address.setCountry(scanCountry.next());
		
		emp.setAddress(address);
		
		System.out.println(" Building No:"+emp.getAddress().getBuildName()+" Block No:"+emp.getAddress().getBlockno()+ " Street No:"+emp.getAddress().getStreet());
	
		System.out.println(" City:"+emp.getAddress().getCity()+" State:"+emp.getAddress().getState()+ " Country:"+emp.getAddress().getCountry());
	

	}

	

	

}
