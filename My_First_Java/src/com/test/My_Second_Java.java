package com.test;

public class My_Second_Java {
	public static int getNumber(){return 1;}  
	public int return_new() {    
		return 2;
	}
	public static void main(String[] args) {
		System.out.println(getNumber());
		System.out.println(new My_Second_Java().return_new());
	}
}
