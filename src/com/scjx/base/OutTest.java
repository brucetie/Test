package com.scjx.base;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

//内部类可以随意使用外部类的成员变量（包括私有）而不用生成外部类的对象，这也是内部类的唯一优点.不需要new
class Out {
	private int age =12;
	
	class in {
		private void print(){
			System.out.println(age);
		}
	}
}
public class OutTest {
  public static void main(String[] args) {
	  
	  Object  obj = new Object();
	  
	  Out.in  o = new Out().new in();
	  
	  InputStreamReader  isr = null;
	  InputStream is =null;
	  FileInputStream fis =null;
	  
  }
  
  
}


