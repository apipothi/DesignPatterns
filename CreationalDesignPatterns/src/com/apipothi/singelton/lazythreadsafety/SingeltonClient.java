package com.apipothi.singelton.lazythreadsafety;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 5.How to "Defeat & Prevent" the "Laziness & Thread Safety " of the Singleton Class.
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
