package com.scjx.proxy;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		ArithmeticCalculator ac = new ArithmeticCalculator();
		ArithmeticCalculatorInvocationHandler  aci = new ArithmeticCalculatorInvocationHandler(ac);
		 /*获得代理*/
        Calculator arithmeticCalculatorProxy = (Calculator)aci.getProxy();

        /*调用add方法*/
        arithmeticCalculatorProxy.add(210, 10);
	}

}
