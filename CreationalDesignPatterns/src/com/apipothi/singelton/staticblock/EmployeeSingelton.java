package com.apipothi.singelton.staticblock;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 4. How to Defeat the Singleton class from Exception and Prevent using Static Block.
 * */

public class EmployeeSingelton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5024084992769095506L;

	private static EmployeeSingelton INSTANCE = null;
	private int employeeid;

	private EmployeeSingelton() throws Exception {

		try {

			int device = 1 / 0;
			File.createTempFile(",", ",");

		} catch (Exception e) {
			System.err.println("Exception occured during Singelton consructor" + e);
		}

	}

	static {

		try {

			INSTANCE = new EmployeeSingelton();

		} catch (Exception e) {

			System.err.println("Exception occured during Singelton" + e);
		}

	}

	public static EmployeeSingelton getEmployeeInstance() {

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
