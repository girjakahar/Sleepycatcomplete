package Testsleepy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Resources.Basesleepy;

public class Homepage extends Basesleepy {
	public WebDriver driver;
	//public static Logger log =LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void logi() throws IOException
	{
	   driver=initializedriver();
	 
	}
    @Test
	public void land()
	{
       driver.get("https://sleepycat.in/");
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   //l.landtxt().getText();
	   System.out.println(l.landtxt().getText());
	   Assert.assertEquals(l.landtxt().getText(),"Get additional 10% off with code COMFYME  | Now delivering in under 72 hours across India*" );
	
}
}
