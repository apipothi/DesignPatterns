package com.apipothi.prototype.copyconstructer;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 1. How to create a “Prototype Pattern” class using "Copy Constructor" in JAVA
 * */
public class ApipothiClient {

	public static void main(String[] args) {

		ApipothiStudents apipothiStudent_Taylor = new ApipothiStudents("Taylor",
				new ApipothiPlaylist("JAVA8", "JAVA9", "Micro Service", "DS", "Array", "Design Pattern-OLD"));
		System.out.println(apipothiStudent_Taylor);
		
		ApipothiStudents apipothiStudents_anna=new ApipothiStudents(apipothiStudent_Taylor);
		apipothiStudents_anna.studentName="Anna";
		System.out.println(apipothiStudents_anna);
		
	}
}
