package com.apipothi.builder;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program :1.How to create a “Builder Patterns” class in JAVA
 * */

public class RecruterPortal {

	public static void main(String[] args) {
		
		/*
		 * TechnologyPortal team1=new TechnologyPortal("JAVA Developer",
		 * "PYTHON DEVELOPER",null,null,null,null,null); System.out.println(team1);
		 * 
		 * TechnologyPortal team2=new TechnologyPortal("JAVA Developer",
		 * "PYTHON DEVELOPER","Spring boot Developer",null,null,null,null);
		 * System.out.println(team2);
		 * 
		 * TechnologyPortal team3=new TechnologyPortal("JAVA Developer",
		 * "PYTHON DEVELOPER","Spring boot Developer",null,null,
		 * null,"ELECTRONJS Developer"); System.out.println(team3);
		 */
		
		
		TechnologyPortal team1=new TechnologyPortal.TechnologyBuilder("JAVA Developer", "PYTHON Developer").build();
		System.out.println(team1);
		
		TechnologyPortal team2=new TechnologyPortal.TechnologyBuilder("JAVA Developer", "PYTHON Developer").
				angular("Angular Developer").build();
		System.out.println(team2);

		TechnologyPortal team3=new TechnologyPortal.TechnologyBuilder("JAVA Developer", "PYTHON Developer").
				angular("Angular Developer").electronjs("Electron JS Developer").build();
		System.out.println(team3);
		
		
	}
}
