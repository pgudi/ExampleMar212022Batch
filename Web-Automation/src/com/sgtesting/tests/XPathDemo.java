package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPath();
	//	relativeXPathUsingTagName();
	//	relativeXPathUsingTagNameWithIndex();
	//	relativeXPathUsingTagNameWithAttributeNameValue();
	//	relativeXPathUsingAttributeNameValueAlone();
	//	relativeXPathUsingAttributeValueAlone();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValue();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOROperator();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator();
	//	relativeXPathUsingPartialMatchingOfAttributeValue();
	//	relativeXPathUsingTagNameWithAttributeName();
	//	relativeXPathUsingTagNameWithAttributeName_1();
	//	relativeXPathUsingTagNameWithAttributeName_2();
	//	relativeXPathUsingTagNameWithTextContent();
	//	relativeXPathUsingTagNameWithTextContent();
		relativeXPathUsingPartialMatchingOfTextContent();
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
			oBrowser.get("file:///F:/HTML/Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteXPath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
		
	}

	/**
	 * Case 1: Identify the Element based on <tagName>
	 * Syntax: //<tagName>
	 *
	 */
	private static void relativeXPathUsingTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser2");
	}
	
	/**
	 * Case 2: Identify the Element based on <tagName> with index
	 * Syntax: //<tagName>[index]
	 *
	 */
	private static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser2");
	}
	
	/**
	 * Case 3: Identify the Element based on <tagName> with 
	 *  attributename and attributevalue combination
	 * Syntax: //<tagName>[@attributename='attributevalue']
	 *
	 */
	private static void relativeXPathUsingTagNameWithAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("DemoUser2");
	}
	
	/**
	 * Case 4: Identify the Element irrespective of <tagName> with 
	 *  attributename and attributevalue combination
	 * Syntax: //*[@attributename='attributevalue']
	 *
	 */
	private static void relativeXPathUsingAttributeNameValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@name='pass1word1']")).sendKeys("DemoUser2");
	}
	
	/**
	 * Case 5: Identify the Element irrespective of <tagName> with 
	 *  irrespective of attributename and using attributevalue alone
	 * Syntax: //*[@*='attributevalue']
	 *
	 */
	private static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}
	
	/**
	 * Case 6: Identify the Element based on <tagName> with 
	 *  Multiple attributename and attributevalue combination
	 * Syntax: //<tagName>[@attributename1='attributevalue'][@attributename2='attributevalue']
	 *
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@type='button'][@value='Submit']")).click();
	}
	
	/**
	 * Case 7: Identify the Element based on <tagName> with 
	 *  Multiple attributename and attributevalue combination using or operator
	 * Syntax: //<tagName>[@attributename1='attributevalue' or @attributename2='attributevalue']
	 *
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' or @value='Submit']")).click();
	}
	
	/**
	 * Case 8: Identify the Element based on <tagName> with 
	 *  Multiple attributename and attributevalue combination using and operator
	 * Syntax: //<tagName>[@attributename1='attributevalue' and @attributename2='attributevalue']
	 *
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
	}
	
	/**
	 * Case 9: Identify the Element based on <tagName> with 
	 *  Attribute name and partial Matching of attributevalue
	 *  starts-with(@attributename,'attributevalue')
	 *  ends-with(@attributename,'attributevalue')
	 *  contains(@attributename,'attributevalue')
	 * Syntax: 
	 *  //<tagName>[starts-with(@attributename,'attributevalue')]
	 *  //<tagName>[ends-with(@attributename,'attributevalue')]
	 *  //<tagName>[contains(@attributename,'attributevalue')]
	 */
	private static void relativeXPathUsingPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit1')]")).click();
	}
	
	/**
	 * Case 10: Identify the Element based on <tagName> with 
	 *  attributename combination
	 * Syntax: //<tagName>[@attributename]
	 *
	 */
	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		// Identify the Number of Links in a Web Page
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_1()
	{
		// click on a particular link using ends-with text content
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.endsWith("Tool"))
			{
				link.click();
				break;
			}
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_2()
	{
		//  org.openqa.selenium.StaleElementReferenceException: 
		//  stale element reference: element is not attached to the page document
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.endsWith("Apache"))
			{
				link.click();
			}
		}
	}
	
	/**
	 * Case 11: Identify the Element based on <tagName> with 
	 *  text content
	 * Syntax: //<tagName>[text()='text content']
	 *
	 */
	private static void relativeXPathUsingTagNameWithTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='S G Software Testing Institute']")).click();
	}
	
	/**
	 * Case 12: Identify the Element based on <tagName> with 
	 *  partial Matching of Text Content
	 *  starts-with(text(),'partial text content')
	 *  ends-with(text(),'partial text content')
	 *  contains(text(),'partial text content')
	 * Syntax: 
	 *  //<tagName>[starts-with(text(),'partial text content')]
	 *  //<tagName>[ends-with(text(),'partial text content')]
	 *  //<tagName>[contains(text(),'partial text content')]
	 */
	private static void relativeXPathUsingPartialMatchingOfTextContent()
	{
		oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
	}
	
}
