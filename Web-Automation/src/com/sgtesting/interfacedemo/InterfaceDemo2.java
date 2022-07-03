package com.sgtesting.interfacedemo;
interface Test1
{
	default void display(String name)
	{
		System.out.println("The Name in the Test1 interface :"+name);
	}
	void showFN(String fname);
}

interface Test2
{
	default void display(String name)
	{
		System.out.println("The Name in the Test2 interface :"+name);
	}
	void showAge(int age);
}

class Demo1 implements Test1,Test2
{
	public void showFN(String fname)
	{
		System.out.println("First Name :"+fname);
	}
	
	public void showAge(int age)
	{
		System.out.println("Age :"+age);
	}
	
	public void display(String name)
	{
		System.out.println("The Name in the Method is :"+name);
	}
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
		Demo1 o=new Demo1();
		o.display("Testing");
		o.showFN("DemoUser1");
		o.showAge(10);

	}

}
