package com.apipothi.singelton.serialization;

import java.io.Serializable;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 3.How to "Defeat and Prevent" the Singleton class from serialization.
 * */

public class EmployeeSingelton implements Serializable {

	private static EmployeeSingelton INSTANCE = null;
	private int employeeid;

	private EmployeeSingelton() {

	}

	public static EmployeeSingelton getEmployeeInstance() {

		if (INSTANCE == null) {

			INSTANCE = new EmployeeSingelton();

		}
		return INSTANCE;

	}
	/**/

	protected Object readResolve() {
		return INSTANCE;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

}
