package Testsleepy;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pageobject.Landingpage;
import Pageobject.loginpageobj;
import Resources.Basesleepy;


public class logintest extends Basesleepy {
	public WebDriver driver;
	//public static Logger log =LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void logi() throws IOException
	{
		driver=initializedriver();
	}
	
	@Test
	public void login() throws Exception
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Landingpage l = new Landingpage(driver);
		l.modal();
		l.log().click();
		loginpageobj log = new loginpageobj(driver);
		log.switchingwindow();
		log.Email().sendKeys(prop.getProperty("Email"));
		log.password().sendKeys(prop.getProperty("password"));
		log.submit().click();
		boolean error = driver.findElement(By.xpath("//div[text()='Incorrect Email or Password']")).isDisplayed();
		if(error) 
		{
			System.out.println("Incorrect login credentials");
		}else
		{
			System.out.println("Customer is successfully logged in");
		}
	}
		

}
