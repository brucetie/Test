package com.scjx.bytes;


/**
 * Copyright &copy; 2014-2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

/**
 * @author Bruce Tie
 * @date 2014-6-13 上午11:52:05 
 * @function
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		byte[] bytes = int2byteArray(132);
		for(byte by :bytes) {
			System.out.println(by);
		}
	
	}
	
	
	/** 
	 * int值转成4字节的byte数组 
	 * @param num 
	 * @return 
	 */  
	public static byte[] int2byteArray(int num) {  
	    byte[] result = new byte[4];  
	    result[0] = (byte)(num >>> 24);//取最高8位放到0下标  
	    result[1] = (byte)(num >>> 16);//取次高8为放到1下标  
	    result[2] = (byte)(num >>> 8); //取次低8位放到2下标   
	    result[3] = (byte)(num );      //取最低8位放到3下标  
	    return result;  
	}  

}
