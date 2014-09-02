package com.scjx.callback;

public class MethodClient {
  public static void main(String[] args) {
	  MethodServer b = new MethodServer();
	  b.getTime(new CallBackInterface() { //注册回调
		
		 @Override
		public void exectueMethod() {
			new MethodClient().testMethod();
		}
		
		@Override
		public void doSome() {
			// TODO Auto-generated method stub
		}
	});
	  
  }
  
  public void testMethod(){
		System.out.println("=======111=====");
      for(int i=0;i<10000;i++){
          System.out.print("");
      }
  }
}
