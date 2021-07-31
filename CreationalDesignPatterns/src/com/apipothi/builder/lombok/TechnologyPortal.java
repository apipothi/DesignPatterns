package com.apipothi.builder.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 1.How to create a “Builder Patterns” class in JAVA
 * */

@Builder(toBuilder = true)
@Getter
@ToString
public class TechnologyPortal {

	private String JAVA;
	private String PYTHON;
	private String SPRINGBOOT;
	private String DEVOPS;
	private String ANGULAR;
	private String REACT;
	private String ELECTRONJS;
	
	
	

}
