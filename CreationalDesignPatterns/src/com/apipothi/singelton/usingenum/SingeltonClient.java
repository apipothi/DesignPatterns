package com.apipothi.singelton.usingenum;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 7.How to create Singleton class using ENUM in JAVA
 * */

public class SingeltonClient {

	public static void main(String[] args) {

		SingletonEnum obj1=SingletonEnum.INSTANCE;
		SingletonEnum obj2=SingletonEnum.INSTANCE;
		
		System.out.println(obj1==obj2);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
