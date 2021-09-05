package Testsleepy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Resources.Basesleepy;

public class Bannerlinkingtest extends Basesleepy {
  
	public WebDriver driver;
	//public static Logger log =LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void logi() throws IOException
	{
	   driver=initializedriver();
	 
	}
	
	@Test(priority=1)
	public void firstbanner() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   l.firstbanner().click();
	   String url = driver.getCurrentUrl();
	   System.out.println(url);
	   verifyLinkActive(url);
	   //Assert.assertEquals(l.landtxt().getText(),"Get additional 10% off with code COMFYME  | Now delivering in under 72 hours across India*" );
	}
	
    @Test(priority=2)
	public void Secondbanner() throws Exception
	{
       driver.get(prop.getProperty("url"));
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   l.nxtbanner().click();
	   l.Secondbanner().click();
	   String url = driver.getCurrentUrl();
	   
	   verifyLinkActive(url);
	   //Assert.assertEquals(l.landtxt().getText(),"Get additional 10% off with code COMFYME  | Now delivering in under 72 hours across India*" );
	}
    
    @Test(priority=3)
	public void Thirdbanner() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   //driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   l.nxtbanner().click();
	   l.nxtbanner().click();
	   l.Thirdbanner().click();
	   String url = driver.getCurrentUrl();
	   
	   verifyLinkActive(url);
	   //Assert.assertEquals(l.landtxt().getText(),"Get additional 10% off with code COMFYME  | Now delivering in under 72 hours across India*" );
	}
    
    @Test(priority=4)
	public void fourthbanner() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   //driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   l.nxtbanner().click();
	   l.nxtbanner().click();
	   l.nxtbanner().click();
	   l.fourthbanner().click();
	   String url = driver.getCurrentUrl();
	   
	   verifyLinkActive(url);
	   //Assert.assertEquals(l.landtxt().getText(),"Get additional 10% off with code COMFYME  | Now delivering in under 72 hours across India*" );
	}

}
