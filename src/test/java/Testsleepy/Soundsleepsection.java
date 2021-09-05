package Testsleepy;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Resources.Basesleepy;

public class Soundsleepsection extends Basesleepy
{
	public WebDriver driver;
	//public static Logger log =LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void logi() throws IOException
	{
	   driver=initializedriver();
	 
	}
	
	@Test(priority=1)
	public void Imagesmattlink() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   WebElement Ele = l.imgmattress();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Ele);
	   l.imgmattress().click();
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	@Test(priority=2)
	public void Imagebedding() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   WebElement Ele = l.imgbedding();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Ele);
	   l.imgbedding().click();
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	@Test(priority=3)
	public void Imgpillow() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   WebElement Ele = l.imgpillow();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Ele);
	   l.imgpillow().click();
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	@Test(priority=4)
	public void imgohayobed() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   WebElement Ele = l.imgohayobed();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", Ele);
	   l.imgohayobed().click();
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	
	@Test(priority=5)
	public void matttxtlink() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   //WebElement Ele = l.txtmattress();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1000)", "");
	   l.txtmattress().click();
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	@Test(priority=6)
	public void txtbeddinglink() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   //WebElement Ele = l.txtbedding();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,1000)", "");
	   l.txtbedding().click();
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	@Test(priority=7)
	public void txtpillowlink() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   //WebElement Ele = l.txtpillow();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,1000)", "");
	   l.txtpillow().click();
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	@Test(priority=8)
	public void txtohayobedlink() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   //WebElement Ele = l.txtohayobed();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,1000)", "");
	   l.txtohayobed().click();
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	

}
