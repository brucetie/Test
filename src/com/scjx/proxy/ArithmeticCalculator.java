package com.scjx.proxy;


/**
 * 目标对象的实现类
 * @author Administrator
 *
 */
public class ArithmeticCalculator implements Calculator {

	@Override
	public double add(double num1, double num2) throws Exception {
		System.out.println("+++++++++");
        double result = num1 + num2;
        return result;
	}

	@Override
	public double sub(double num1, double num2) throws Exception {

	        double result = num1 - num2;
	
	        return result;
	}

	@Override
	public double div(double num1, double num2) throws Exception {

	        double result = num1 / num2;

	        return result;
	}

	@Override
	public double mul(double num1, double num2) throws Exception {

        double result = num1 * num2;

       return result;
	}

}
