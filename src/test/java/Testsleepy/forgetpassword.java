package Testsleepy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Pageobject.loginpageobj;
import Resources.Basesleepy;

public class forgetpassword extends Basesleepy{
	public WebDriver driver;
	

	@BeforeTest
	public void logi() throws IOException
	{
		driver=initializedriver();
	}
	
	
	@Test
	public void forgetflow() throws Exception
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Landingpage l = new Landingpage(driver);
		l.modal();
		l.log().click();
		loginpageobj log = new loginpageobj(driver);
		log.switchingwindow();
		log.forget().click();
		log.forgetemail().sendKeys("test@test.com");
	
}
}
