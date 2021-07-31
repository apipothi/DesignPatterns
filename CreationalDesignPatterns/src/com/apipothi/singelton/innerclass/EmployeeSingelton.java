package com.apipothi.singelton.innerclass;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 6. How to create a Singleton class using INNER CLASS in JAVA
 * */

public class EmployeeSingelton {

	private EmployeeSingelton() {

	}

	private static class EmployeeSingeltonInner {

		private static final EmployeeSingelton INSTANCE = new EmployeeSingelton();
	}

	public static EmployeeSingelton getEmployeeInstance() {

		return EmployeeSingeltonInner.INSTANCE;
	}
}
