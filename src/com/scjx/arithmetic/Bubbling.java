package com.scjx.arithmetic;

import java.util.ArrayList;
import java.util.List;


/*
 * 冒泡排序先找出最大或最小的，再找出第二大或第二小的
 */
public class Bubbling {
	
	public static void main(String[] args) {
		int [] arg ={3,1,9,2,8,7};
		int temp =0;
		ok :for(int i =0;i<arg.length-1;i++){
			for(int j=i+1;j<arg.length;j++){//将最小的放第一个，所以这里的范围在缩小。
	
				if(arg[i]>arg[j]) {
				
					temp = arg[i];
					arg[i]=arg[j];
					arg[j]=temp;
					//break ok;
				}
			}
		}
		
		for(int i:arg) {
			System.out.println(i);
		}
		
		List a = new ArrayList();
		
	}

}
