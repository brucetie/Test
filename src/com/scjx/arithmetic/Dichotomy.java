package com.scjx.arithmetic;

/*
 * 二分法查找
 */
public class Dichotomy {

	public static void main(String[] args) {
		int [] a ={1,3,5,7,9,11,13};
		int search = 3;
		int lower =0;
		int temp = a.length-1;
		int index =-1;
		while(lower<=temp) {
			 index = (lower+temp)/2;//开始加结束位置的中间值比较
			int current = a[index];
			if(current ==search){
				break;
			} else if(current < search){
				lower = index+1;
			} else {
				temp = index-1;
			}
			
		}
		
		if(lower<=temp){
			System.out.println(index+1);
		}else {
			System.out.println("NO");
		}
	}
}
