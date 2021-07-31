package com.apipothi.factory.patterns;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 1.How to create a factory Patterns class in JAVA
 * */

public class FactoryClient {

	public static void main(String[] args) {

		
		YoutubeFactory factory=new YoutubeFactory();
		
		factory.getLearningURL("MICROSERVICE").learnFromYoutube();
		factory.getLearningURL("DESIGNPATTERN").learnFromYoutube();
		factory.getLearningURL("JAVA9").learnFromYoutube();
	}

}
