package com.apipothi.prototype.copyconstructer;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 1. How to create a “Prototype Pattern” class using "Copy Constructor" in JAVA
 * */
public class ApipothiStudents {

	String studentName;
	ApipothiPlaylist apipothiPlaylist;

	public ApipothiStudents(String studentName, ApipothiPlaylist apipothiPlaylist) {
		super();
		this.studentName = studentName;
		this.apipothiPlaylist = apipothiPlaylist;
	}

	public ApipothiStudents(ApipothiStudents apipothiStudents) {
		studentName = apipothiStudents.studentName;
		apipothiPlaylist = new ApipothiPlaylist(apipothiStudents.apipothiPlaylist);

	}

	@Override
	public String toString() {
		return "ApipothiStudents [studentName=" + studentName + ", apipothiPlaylist=" + apipothiPlaylist + "]";
	}

}
