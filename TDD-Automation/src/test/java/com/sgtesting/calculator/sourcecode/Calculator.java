package com.sgtesting.calculator.sourcecode;

public class Calculator {
	
	/**
	 * Addition Method
	 */
	public int addition(int x,int y)
	{
		int result=0;
		try
		{
			result=(x+y);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Subtraction Method
	 */
	public int Subtraction(int x,int y)
	{
		int result=0;
		try
		{
			result=(x-y);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Multiplication Method
	 */
	public int multiplication(int x,int y)
	{
		int result=0;
		try
		{
			result=(x*y);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Division Method
	 */
	public int division(int x,int y)
	{
		int result=0;
		try
		{
			result=(x/y);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}

}
