package com.sgtesting.interfacedemo;
interface University
{
	static void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
	
	void displayCityName(String name);
}

class SLNEngg implements University
{
	public void displayCityName(String name)
	{
		System.out.println("City Name in Which Engineerig College exists :"+name);
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		SLNEngg o=new SLNEngg();
		o.displayCityName("Bangalore");
		University.showUniversityName("VTU Belguam");

	}

}
