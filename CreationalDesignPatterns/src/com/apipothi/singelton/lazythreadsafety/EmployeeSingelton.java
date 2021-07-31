package com.apipothi.singelton.lazythreadsafety;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 5.How to "Defeat & Prevent" the "Laziness & Thread Safety " of the Singleton Class.
 * */

public class EmployeeSingelton {

	private static EmployeeSingelton INSTANCE = null;

	private EmployeeSingelton() {

	}

	/*
	 * public static synchronized EmployeeSingelton getEmployeeInstance() {
	 * 
	 * if (INSTANCE == null) {
	 * 
	 * INSTANCE = new EmployeeSingelton();
	 * 
	 * }
	 * 
	 * return INSTANCE;
	 * 
	 * }
	 */

	/* Double check Singelton */

	public static EmployeeSingelton getEmployeeInstance() {

		if (INSTANCE == null) {

			synchronized (EmployeeSingelton.class) {

				if (INSTANCE == null) {

					INSTANCE = new EmployeeSingelton();
				}
			}

		}

		return INSTANCE;

	}

}
