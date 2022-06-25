package com.sgtesting.tests;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number :");
			int num=sc.nextInt();		
			System.out.println(num);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
