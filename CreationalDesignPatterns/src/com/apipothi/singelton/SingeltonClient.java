package com.apipothi.singelton;

import java.lang.reflect.Constructor;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 1.How to create a very basic Singleton class in JAVA
 * */

public class SingeltonClient {

	public static void main(String[] args) {
		 
		EmployeeSingelton emp1=EmployeeSingelton.getEmployeeInstance();
		EmployeeSingelton emp2=EmployeeSingelton.getEmployeeInstance();
		
		EmployeeSingelton emp3=EmployeeSingelton.getEmployeeInstance();
		EmployeeSingelton emp4=EmployeeSingelton.getEmployeeInstance();
		
		System.out.println(emp1==emp2);
		System.out.println(emp3==emp4);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		
	}
	
	
}
