package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		showURL();
		showTitle();
		displayLinksCount();
		enterValueInTextFiled1();
		enterValueInTextFiled2();
	//	clickOnButton1();
	//	clickOnButton2();
	//	clickOnCheckBox1();
	//	clickOnCheckBox2();
	//	clickOnRadioButton1();
	//	clickOnRadioButton2();
		selectItemFromDropDown();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("file:///F:/HTML/Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void showURL()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String url=(String) js.executeScript("var kk=document.URL;return kk");
		System.out.println("URL of the Application :"+url);
	}
	
	private static void showTitle()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String title=(String) js.executeScript("var kk=document.title;return kk");
		System.out.println("Title of the Application :"+title);
	}
	
	private static void displayLinksCount()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		long links=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length");
		System.out.println("# of Links :"+links);
	}
	
	private static void enterValueInTextFiled1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
	}
	
	private static void enterValueInTextFiled2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.name("pass1word1"));
		js.executeScript("arguments[0].value='DemoUser2';", oEle);
	}
	
	private static void clickOnButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	
	private static void clickOnButton2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@value='Submit']"));
		js.executeScript("arguments[0].click();", oEle);
	}
	
	private static void clickOnCheckBox1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk2linux').click();");
	}
	
	private static void clickOnCheckBox2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@name='windows']"));
		js.executeScript("arguments[0].click();", oEle);
	}
	
	private static void clickOnRadioButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('rad1chrome').click();");
	}
	
	private static void clickOnRadioButton2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@name='firefox']"));
		js.executeScript("arguments[0].click();", oEle);
	}
	
	private static void selectItemFromDropDown()
	{
		JavascriptExecutor js=null;
		js=(JavascriptExecutor) oBrowser;
		
		String str="";
		str+="var list=document.getElementById('tools');";
		str+="for(var i=0;i<list.length;i++)";
		str+="{";
		str+="if(list[i].text='Selenium RemoteControl')";
		str+="{";
		str+="list[i].selected='1'";
		str+="}";
		str+="}";
		js.executeScript(str);
	}

}
