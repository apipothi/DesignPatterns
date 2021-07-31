package com.apipothi.prototype.copyconstructer;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 1. How to create a “Prototype Pattern” class using "Copy Constructor" in JAVA
 * */
public class ApipothiPlaylist {

	String java8;
	String java9;
	String microservice;
	String ds;
	String array;
	String designPatterns;

	public ApipothiPlaylist(String java8, String java9, String microservice, String ds, String array,
			String designPatterns) {
		super();
		this.java8 = java8;
		this.java9 = java9;
		this.microservice = microservice;
		this.ds = ds;
		this.array = array;
		this.designPatterns = designPatterns;
	}

	public ApipothiPlaylist(ApipothiPlaylist apipothiPlaylist) {

		this(   apipothiPlaylist.java8, 
				apipothiPlaylist.java9, 
				apipothiPlaylist.microservice, 
				apipothiPlaylist.ds,
				apipothiPlaylist.array, 
				apipothiPlaylist.designPatterns
				);
	}

	@Override
	public String toString() {
		return "ApipothiPlaylist [java8=" + java8 + ", java9=" + java9 + ", microservice=" + microservice + ", ds=" + ds
				+ ", array=" + array + ", designPatterns=" + designPatterns + "]";
	}

}
