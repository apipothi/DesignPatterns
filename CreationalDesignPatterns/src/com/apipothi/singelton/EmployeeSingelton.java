package com.apipothi.singelton;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 1.How to create a very basic Singleton class in JAVA
 * */

public class EmployeeSingelton {

	private static EmployeeSingelton INSTANCE = null;

	private EmployeeSingelton() {

	}

	public static EmployeeSingelton getEmployeeInstance() {

		if (INSTANCE == null) {
			
			INSTANCE = new EmployeeSingelton();
			
		}

		return INSTANCE;

	}
}
