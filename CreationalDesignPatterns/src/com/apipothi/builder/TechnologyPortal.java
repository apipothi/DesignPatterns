package com.apipothi.builder;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 1.How to create a “Builder Patterns” class in JAVA
 * */

public class TechnologyPortal {

	private final String JAVA;
	private final String PYTHON;
	private final String SPRINGBOOT;
	private final String DEVOPS;
	private final String ANGULAR;
	private final String REACT;
	private final String ELECTRONJS;

	public TechnologyPortal(TechnologyBuilder builder) {
		super();
		this.JAVA = builder.java;
		this.PYTHON = builder.python;
		this.SPRINGBOOT = builder.springboot;
		this.DEVOPS = builder.devops;
		this.ANGULAR = builder.angular;
		this.REACT = builder.react;
		this.ELECTRONJS = builder.electronjs;
	}

	public String getJAVA() {
		return JAVA;
	}

	public String getPYTHON() {
		return PYTHON;
	}

	public String getSPRINGBOOT() {
		return SPRINGBOOT;
	}

	public String getDEVOPS() {
		return DEVOPS;
	}

	public String getANGULAR() {
		return ANGULAR;
	}

	public String getREACT() {
		return REACT;
	}

	public String getELECTRONJS() {
		return ELECTRONJS;
	}

	@Override
	public String toString() {
		return "TechnologyPortal [JAVA=" + JAVA + ", PYTHON=" + PYTHON + ", SPRINGBOOT=" + SPRINGBOOT + ", DEVOPS="
				+ DEVOPS + ", ANGULAR=" + ANGULAR + ", REACT=" + REACT + ", ELECTRONJS=" + ELECTRONJS + "]";
	}

	/* Builder Class */

	static class TechnologyBuilder {

		private final String java; // *
		private final String python;// *
		private String springboot;
		private String devops;
		private String angular;
		private String react;
		private String electronjs;

		public TechnologyBuilder(String java, String python) {
			super();
			this.java = java;
			this.python = python;
		}

		public TechnologyBuilder springboot(String springboot) {

			this.springboot = springboot;
			return this;
		}

		public TechnologyBuilder devops(String devops) {

			this.devops = devops;
			return this;
		}

		public TechnologyBuilder angular(String angular) {

			this.angular = angular;
			return this;
		}

		public TechnologyBuilder react(String react) {

			this.react = react;
			return this;
		}

		public TechnologyBuilder electronjs(String electronjs) {

			this.electronjs = electronjs;
			return this;
		}

		/* Instance Creation */

		public TechnologyPortal build() {

			TechnologyPortal portal = new TechnologyPortal(this);
			return portal;
		}
	}

}
