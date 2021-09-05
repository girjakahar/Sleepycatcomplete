package Testsleepy;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Resources.Basesleepy;

public class Socialmedialinks extends Basesleepy
{
	public WebDriver driver;
	//public static Logger log =LogManager.getLogger(Base.class.getName());

	
	@BeforeMethod
	public void logi() throws IOException
	{
	   driver=initializedriver();
	 
	}
	
	@AfterMethod
	public void close() throws IOException
	{
	   driver.quit();
	 
	}
	
	
	@Test(priority=1)
	public void facebooklink() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   //WebElement Ele = l.Facebook();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       //js.executeScript("arguments[0].scrollIntoView();", Ele);
	   js.executeScript("window.scrollBy(0,4500)", "");
	   l.Facebook().click();
	   Set<String> window = driver.getWindowHandles();
	   Iterator<String> it = window.iterator();
	   String Parentid=it.next();
	   String Childid=it.next();
       driver.switchTo().window(Childid);
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	
	@Test(priority=3)
	public void Instagramlink() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   //WebElement Ele = l.Instagram();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       //js.executeScript("arguments[0].scrollIntoView();", Ele);
	   js.executeScript("window.scrollBy(0,4500)", "");
	   l.Instagram().click();
	   Set<String> window = driver.getWindowHandles();
	   Iterator<String> it = window.iterator();
	   String Parentid=it.next();
	   String Childid=it.next();
       driver.switchTo().window(Childid);
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	
	@Test(priority=2)
	public void Youtubelink() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   //WebElement Ele = l.Youtube();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       //js.executeScript("arguments[0].scrollIntoView();", Ele);
	   js.executeScript("window.scrollBy(0,4500)", "");
	   l.Youtube().click();
	   Set<String> window = driver.getWindowHandles();
	   Iterator<String> it = window.iterator();
	   String Parentid=it.next();
	   String Childid=it.next();
       driver.switchTo().window(Childid);
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
	@Test(priority=4)
	public void Twitterlink() throws Exception
	{
       driver.get(prop.getProperty("url"));
  	   driver.manage().window().maximize();
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   WebElement Ele = l.twitter();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       //js.executeScript("arguments[0].scrollIntoView();", Ele);
	   js.executeScript("window.scrollBy(0,4500)", "");
	   l.twitter().click();
	   Set<String> window = driver.getWindowHandles();
	   Iterator<String> it = window.iterator();
	   String Parentid=it.next();
	   String Childid=it.next();
       driver.switchTo().window(Childid);
	   String url = driver.getCurrentUrl();
	   verifyLinkActive(url);
	   
	}
}
