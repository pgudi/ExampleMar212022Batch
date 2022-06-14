package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowsersDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popupBrowsers();
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
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void popupBrowsers()
	{
		WebElement oLink=null;
		try
		{
			oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before Click on the Link,# of Popups :"+popupCount());
			oLink.click();
			Thread.sleep(4000);
			System.out.println("After Click on the Link,# of Popups :"+popupCount());
			if(popupCount()>0)
			{
				popupBrowserHandling();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static int popupCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	private static void popupBrowserHandling()
	{
		String parentWindow=null;
		Object[] popups=null;
		try
		{
			parentWindow=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentWindow);
			popups=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				Thread.sleep(2000);
				oBrowser.switchTo().window(childBrowser);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(4000);
				String content=oBrowser.findElement(By.xpath("//div[@class='start-trial__title']")).getText();
				System.out.println(content);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
