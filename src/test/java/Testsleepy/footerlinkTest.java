package Testsleepy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Resources.Basesleepy;

public class footerlinkTest extends Basesleepy {
	
	
	public WebDriver driver;
	//public static Logger log =LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void forget() throws IOException
	{
		driver=initializedriver();
	  }
	
	@Test
	public void Homepagelink() throws Exception
	{
		driver.get(prop.getProperty("url"));
		
		Landingpage l = new Landingpage(driver);
		l.modal();
		List<WebElement> links=driver.findElements(By.tagName("a"));//This is for complete homepage
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_1 sec']//a"));//This is for checking Header only
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_3']//a"));//This is for menu links only
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-bottom clearfix']//a"));//this is only for footer only
		System.out.println("Total Homepagelink are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
	}
	
	@Test
	public void Headerlink() throws Exception
	{
		driver.get(prop.getProperty("url"));
		
		Landingpage l = new Landingpage(driver);
		l.modal();
		//List<WebElement> links=driver.findElements(By.tagName("a"));//This is for complete homepage
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_1 sec']//a"));//This is for checking Header only
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_3']//a"));//This is for menu links only
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-bottom clearfix']//a"));//this is only for footer only
		System.out.println("Total Headerlink are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
	}
	
	@Test
	public void menulink() throws Exception
	{
		driver.get(prop.getProperty("url"));
		
		Landingpage l = new Landingpage(driver);
		l.modal();
		//List<WebElement> links=driver.findElements(By.tagName("a"));//This is for complete homepage
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_1 sec']//a"));//This is for checking Header only
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_3']//a"));//This is for menu links only
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-bottom clearfix']//a"));//this is only for footer only
		System.out.println("Total menulink are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
	}
	
	@Test
	public void Footerlink() throws Exception
	{
		driver.get(prop.getProperty("url"));
		
		Landingpage l = new Landingpage(driver);
		l.modal();
		//List<WebElement> links=driver.findElements(By.tagName("a"));//This is for complete homepage
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_1 sec']//a"));//This is for checking Header only
		//List<WebElement> links=driver.findElements(By.xpath("//div[@class='header_row_3']//a"));//This is for menu links only
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-bottom clearfix']//a"));//this is only for footer only
		System.out.println("Total Footerlink are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
	}
	
	


}
