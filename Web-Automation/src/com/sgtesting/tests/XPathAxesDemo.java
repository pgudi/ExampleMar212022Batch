package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForPersonSachinTendulakr();
	//	enterSalaryFor2ndRowFromPersonRahulDravid();
	//	makeStatusActiveForIndianFreedomFighter();
	//	fromSachinTendulkarHisPrevious2ndRecordMakeSTatusAsActive();
	//	getIDAttributeValueOfTableBasedOnChildElement();
		basedOnTableFor5thRowEnterSalary();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///E:/HTML/WebTableHTML.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * following-sibling
	 * Scenario: For Person Sachin Tendular, Enter the salary 25000
	 * XPath1: //td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input
	 * XPath2: //td[text()='Sachin Tendulkar']/following-sibling::td[4]/input
	 */
	private static void enterSalaryForPersonSachinTendulakr()
	{
	//	oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("26000");
	}
	
	/**
	 * following
	 * Scenario: From Person Rahul Dravid 2nd row enter the Salary 15000
	 * XPath: //td[text()='Rahul Dravid']/following::tr[1]/following::tr[1]/td[6]/input
	 */
	private static void enterSalaryFor2ndRowFromPersonRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/following::tr[1]/td[6]/input")).sendKeys("15000");
	}
	
	/**
	 * preceding-sibling
	 * Scenario: Make the status as Active for Indian Freedom Fighter
	 * XPath: //td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input
	 */
	private static void makeStatusActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	/**
	 * preceding
	 * Scenario: From Sachin Tendulkar his previous Second Record,Make the status as Active
	 * XPath: //td[text()='Sachin Tendulkar']/preceding::tr[1]/preceding::tr[1]/td[1]/input
	 */
	private static void fromSachinTendulkarHisPrevious2ndRecordMakeSTatusAsActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[1]/preceding::tr[1]/td[1]/input")).click();
	}
	
	/**
	 * ancestor
	 * Scenario: Based on the Sachin Tendulkar Salary Text Field,Get the id attribute value of the table
	 * XPath: //input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table
	 */
	private static void getIDAttributeValueOfTableBasedOnChildElement()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
		String val=oEle.getAttribute("id");
		System.out.println(val);
	}
	
	/**
	 * descendant
	 * Scenario: From the Table for 5th Row Enter the Salary 21000
	 * XPath: //table[@id='tbl1']/descendant::tr[5]/td[6]/input
	 */
	private static void basedOnTableFor5thRowEnterSalary()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[5]/td[6]/input")).sendKeys("21000");
	}
}
