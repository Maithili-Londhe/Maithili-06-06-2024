package com.exceptionHandlingScenarios;

import java.util.Scanner;

//Scenario-2: try-catch-finally
public class Example2 {

	public static void main(String[] args) 
	{
		//Resource leak: 'scanner' is never closed
		Scanner scanner = new Scanner(System.in);
		
		try//try is a block, which can has problematic part/statements
		{				
			System.out.println("Enter any text: ");
			String text = scanner.nextLine();
			
			System.out.println(text.charAt(29));			
		}
		catch(Exception e)//catch is a block, which has handler part/statements
		{
			e.printStackTrace();//to trace the exception in program, with instruction line number
		}	
		finally//Compulsory statements are part of the finally block.
		{
			System.out.println("Compulsory statements are part of: finnaly block");
			scanner.close();
		}

	}

}
