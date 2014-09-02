package com.scjx.exception;



/**
 * @author Bruce Tie
 * @date 2014-8-20 下午8:29:41 
 * @function
 */
public class TestException {
	
	
	
	public static void firstException() throws MyFirstException{
		throw new MyFirstException("\"firstException()\" method occurs an exception!");
	}

	public static void secondException() throws MySecondException{
		throw new MySecondException("\"secondException()\" method occurs an exception!");
	}
		

	/**
	 * @param args
	 * @throws MyFirstException 
	 */
	public static void main(String[] args)  {
		
		try {

			TestException.firstException();

			TestException.secondException();

			} catch (MyFirstException e1){

			System.out.println("Exception: " + e1.getMessage());

			e1.printStackTrace();

			} catch (MySecondException e2){

			System.out.println("Exception: " + e2.getMessage());

			e2.printStackTrace();

			}
	}

}
