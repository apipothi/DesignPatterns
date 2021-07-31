package com.apipothi.singelton.staticblock;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 4. How to Defeat the Singleton class from Exception and Prevent using Static Block.
 * */

public class SingeltonClient {

	public static void main(String[] args) throws Exception {

		EmployeeSingelton employeeinstance = EmployeeSingelton.getEmployeeInstance();
		employeeinstance.setEmployeeid(100);

		String filename = "SingeltonClient.txt";
		saveDataToFile(employeeinstance, filename);/* serialization */

		employeeinstance.setEmployeeid(200);
		EmployeeSingelton employeeinstance2 = readDataToFile(filename);/// * Deserialization */

		System.out.println(employeeinstance == employeeinstance2);

		System.out.println(employeeinstance.hashCode());
		System.out.println(employeeinstance2.hashCode());

		System.out.println(employeeinstance.getEmployeeid());// 200
		System.out.println(employeeinstance2.getEmployeeid());// 200

	}

	/* serialization */
	static void saveDataToFile(EmployeeSingelton employeesingelton, String filename) throws Exception {

		try (FileOutputStream fileOutput = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(fileOutput)) {

			out.writeObject(employeesingelton);
		}
	}

	/* Deserialization */
	static EmployeeSingelton readDataToFile(String filename) throws Exception {

		try (FileInputStream filein = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(filein)) {

			return (EmployeeSingelton) in.readObject();
		}

	}

}
