package com.exceptionHandlingScenarios;

//Scenario-1: try-catch
public class Example1 {

	public static void main(String[] args) 
	{
		
		try//try is a block, which can has problematic part/statements
		{			
			String text = "My country name is Bharat";
			System.out.println(text.charAt(80));			
		}
		catch(Exception e)//catch is a block, which has handler part/statements
		{
			e.printStackTrace();//to trace the exception in program, with instruction line number
		}		

	}

}
