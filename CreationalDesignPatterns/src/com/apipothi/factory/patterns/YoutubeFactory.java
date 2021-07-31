package com.apipothi.factory.patterns;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 1.How to create a factory Patterns class in JAVA
 * */

public class YoutubeFactory {

	public Apipothi getLearningURL(String courseName) {

		if (courseName != null) {

			if (courseName.equalsIgnoreCase("MICROSERVICE")) {
				return new MicroservicesLearning();
			}

			if (courseName.equalsIgnoreCase("DESIGNPATTERN")) {
				return new DesignPatternLearning();
			}

			if (courseName.equalsIgnoreCase("JAVA9")) {
				return new Java9Learning();
			}

		} else {

			return null;
		}

		return null;

	}
}
