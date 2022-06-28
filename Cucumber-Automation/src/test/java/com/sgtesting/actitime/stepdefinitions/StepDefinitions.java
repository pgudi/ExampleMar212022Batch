package com.sgtesting.actitime.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Given("^I launch the chrome browser$")
	public void I_launch_the_chrome_browser()
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
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I navigate the URL of the application$")
	public void I_navigate_the_URL_of_the_application()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the usename in username text field$")
	public void I_enter_the_usename_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter the password in password text field$")
	public void I_enter_the_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on Login button$")
	public void I_click_on_Login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Then("^I find the Home Page$")
	public void I_find_the_Home_Page()
	{
		try
		{
			Assert.assertTrue(oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']")).isDisplayed());
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Given("^I find the logout link in Home Page$")
	public void I_find_the_logout_link_in_Home_Page()
	{
		String expected="Logout";
		try
		{
			String actual=oBrowser.findElement(By.linkText("Logout")).getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@When("^I click on Logout link$")
	public void I_click_on_Logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Then("^I find the login page$")
	public void I_find_the_login_page()
	{
		String expected="actiTIME - Login";
		try
		{
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I close Application$")
	public void I_close_Application()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I minimize the flyoutwindow$")
	public void I_minimize_the_flyoutwindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
