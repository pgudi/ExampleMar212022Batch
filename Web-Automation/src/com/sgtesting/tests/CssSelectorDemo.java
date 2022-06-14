package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCssSelector();
	//	relativeCssBasedOnTagName();
	//	relativeCssBasedOnTagNameWithIDAttributeValue();
	//	relativeCssBasedOnIDAttributeValue();
	//	relativeCssBasedOnTagNameWithClassAttributeValue();
	//	relativeCssBasedOnClassAttributeValue();
	//	relativeCssBasedOnTagNameWithAttributeNameValue();
	//	relativeCssBasedOnAttributeNameValue();
	//	relativeCssBasedOnMultipleAttributeNameValue();
	//	relativeCssBasedOnPartialMatchingOfAttributeValue();
	//	relativeCssBasedOnTagNameAndAttributeName();
	//	relativeCssBasedOnTagNameAndAttributeName_01();
	//	relativeCssBasedOnTagNameAndAttributeName_02();
	//	relativeCssBasedOnParentElementReference();
	//	relativeCssBasedOnnthChild();
		relativeCssBasedOnSiblings();
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
			oBrowser.get("file:///E:/HTML/Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void absoluteCssSelector()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 1: cssSelecor based on tagName
	 * Syntax: <tagName>
	 */
	private static void relativeCssBasedOnTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 2: cssSelecor based on tagName with id attribute value
	 * Syntax: <tagName>#<id attribute value>
	 */
	private static void relativeCssBasedOnTagNameWithIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("Welcome123");
	}
	
	/**
	 * Case 3: cssSelecor based on id attribute value alone
	 * Syntax: #<id attribute value>
	 */
	private static void relativeCssBasedOnIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("Welcome123");
	}
	
	/**
	 * Case 4: cssSelecor based on tagName with class attribute value
	 * Syntax: <tagName>.<class attribute value>
	 */
	private static void relativeCssBasedOnTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.submit1btn1")).click();
	}
	
	/**
	 * Case 5: cssSelecor based on class attribute value
	 * Syntax: .<class attribute value>
	 */
	private static void relativeCssBasedOnClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".submit1btn1")).click();
	}
	/**
	 * Case 6: cssSelecor based on tagName with attributeName and value combination
	 * Syntax: <tagName>[attributename='attributevalue']
	 */
	private static void relativeCssBasedOnTagNameWithAttributeNameValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	/**
	 * Case 7: cssSelecor based on attributeName and value combination
	 * Syntax: *[attributename='attributevalue']
	 */
	private static void relativeCssBasedOnAttributeNameValue()
	{
		oBrowser.findElement(By.cssSelector("*[value='Submit']")).click();
	}
	
	/**
	 * Case 8: cssSelecor based on tagname with Multiple attribute Name value combination
	 * Syntax: <tagName>[attributename='attributevalue'][attributename='attributevalue']
	 */
	private static void relativeCssBasedOnMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit'][name='submit1btn1']")).click();
	}
	
	/**
	 * Case 9: cssSelecor based on Partial Matching of Attribute Value
	 * Syntax: 
	 *   ^=  starts-with
	 *   $=  ends-with
	 *   *=  contains
	 *  <tagName>[attributename ^= 'attribute value']
	 *  <tagName>[attributename $= 'attribute value']
	 *  <tagName>[attributename *= 'attribute value']
	 */
	private static void relativeCssBasedOnPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
		oBrowser.findElement(By.cssSelector("input[id *= 'submit1']")).click();
	}
	
	/**
	 * Case 10: cssSelecor based on tagName with attributeName
	 * Syntax: <tagName>[AttributeName]
	 */
	private static void relativeCssBasedOnTagNameAndAttributeName()
	{
		//Find Number of Links in a Web Page
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	private static void relativeCssBasedOnTagNameAndAttributeName_01()
	{
		//Display All available Link Names
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			System.out.println(content);
		}
	}
	
	private static void relativeCssBasedOnTagNameAndAttributeName_02()
	{
		// org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		// element is not attached to the page document
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			System.out.println(content);
			if(content.endsWith("Testing"))
			{
				link.click();
			}
		}
	}
	
	/**
	 * Case 11: cssSelecor based on Parent Element Reference
	 * Syntax: ParentElement >childElement
	 */
	private static void relativeCssBasedOnParentElementReference()
	{
		oBrowser.findElement(By.cssSelector("div#d2 >form#frm2 >input")).click();
	}
	
	/**
	 * Case 12: cssSelecor based on nth-child concept
	 * Syntax: ParentElement >nth-child(number)
	 */
	private static void relativeCssBasedOnnthChild()
	{
	//	oBrowser.findElement(By.cssSelector("div#d3 >form#frm3 :nth-child(3)")).sendKeys("DemoUser3");
		oBrowser.findElement(By.cssSelector("div#d3 >form#frm3 :nth-child(7)")).sendKeys("DemoUser7");
	}
	
	/**
	 * Case 13: cssSelecor based on Siblings
	 * Syntax: sibling1 + sibling2 + sibling3
	 */
	private static void relativeCssBasedOnSiblings()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 >input + input + input")).sendKeys("DemoUser");
	}
}
