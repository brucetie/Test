/**
 * Copyright &copy; 2014-2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.scjx.base;

/**
 * @author Bruce Tie
 * @date 2014-9-2 上午10:46:14 
 * @function
 */
public class TestClassResource {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(TestClassResource.class.getResource(""));
		System.out.println(TestClassResource.class.getResource("/"));
		System.out.println(TestClassResource.class.getClassLoader().getResource(""));
	}

}
