package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		mouseOperations();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			oBrowser=new ChromeDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void mouseOperations()
	{
		try
		{
			Actions oMouse=new Actions(oBrowser);
			WebElement oButton=oBrowser.findElement(By.xpath("//button[text()='✕']"));
			Thread.sleep(2000);
			oMouse.doubleClick(oButton).build().perform();
			Thread.sleep(4000);
			WebElement oEleObject=oBrowser.findElement(By.xpath("//div[text()='Electronics']"));
			Thread.sleep(2000);
			oMouse.moveToElement(oEleObject).build().perform();
			Thread.sleep(4000);
			oBrowser.findElement(By.linkText("Electronics GST Store")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
