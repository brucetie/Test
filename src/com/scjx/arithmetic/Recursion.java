package com.scjx.arithmetic;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Recursion {
	static int lastage =0;
	static int i =1;
	Collection aa = new HashSet();

    
	public static void main(String[] args) {
		int age = addAge (8);
		System.out.println(age);
	}
	
	public static int addAge(int n){

		if(n==1) return 10;
			addAge(n+2);
		if(i++==8) 
		return n;
		return n;
	
	
		
	}

}
