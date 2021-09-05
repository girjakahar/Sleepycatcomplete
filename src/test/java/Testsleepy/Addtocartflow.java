package Testsleepy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.Checkoutpage;
import Pageobject.Landingpage;
import Pageobject.productdetailspage;
import Resources.Basesleepy;

public class Addtocartflow extends Basesleepy {
	
	static WebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(Basesleepy.class.getName());
	
	@BeforeTest
	public void logi() throws IOException
	{
	   driver=initializedriver();
	}
	
    @Test
	public void addtocart() throws Exception
	{
    	
       driver.get("https://sleepycat.in/");
       log.info("Website opened Successfully");
       
  	   driver.manage().window().maximize();
  	   log.info("Website is maximized");
  	   
  	   wait = new WebDriverWait(driver, 20);
	   Landingpage l = new Landingpage(driver);
	   l.modal();
	   l.maattheader();
	   log.info("Submenu link is opened");
	   
	   wait.until(ExpectedConditions.visibilityOf(l.headmenu()));
	   l.headmenu().click();
	   log.info("Clicked on first submenu option");
	   
	   l.modal();
	   productdetailspage pd = new productdetailspage(driver);
	   wait.until(ExpectedConditions.visibilityOf(pd.Queen()));
	   //pd.Scroll();
	   pd.Queen().click();
	   log.info("Clicked on Queen option");
	   
	   l.modal();
	   pd.Scroll();
	   log.info("Scrolled down to size section");
	   
	   pd.cm().click();
	   log.info("Clicked on cm option");
	   
	   pd.sizedropdown().click();
	   log.info("Clicked on sizedropdown field");
	   
	   wait.until(ExpectedConditions.visibilityOf(pd.sizecm()));
	   pd.sizecm().click();
	   log.info("Clicked on one size option from the dropdown");
	   
	   pd.Addtocart();
	   log.info("Clicked on add to cart button");
	   
	   l.modal();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("secure_checkout")));
	   driver.findElement(By.id("secure_checkout")).click();
	   log.info("Clicked on Secure checkout button");
	   
	   Checkoutpage Chout = new Checkoutpage(driver);
	   wait.until(ExpectedConditions.visibilityOf(Chout.billing_first_name()));
	   Chout.billing_first_name().sendKeys("Test");
	   log.info("First name is entered");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.billing_last_name()));
	   Chout.billing_last_name().sendKeys("sel");
	   log.info("last name is entered");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.billing_email()));
	   Chout.billing_email().sendKeys("Test@red.com");
	   log.info("Email id is entered");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.billingphone()));
	   Chout.billingphone().sendKeys("8888888888");
	   log.info("Phone number is entered");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.noticheckbox()));
	   Chout.noticheckbox().click();
	   log.info("Notification checkbox is checked");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.Contshipping()));
	   Chout.Contshipping().click();
	   log.info("Clicked on continue to shopping button");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.street()));
	   Chout.street().sendKeys("Street");
	   log.info("Street name is entered");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.house()));
	   Chout.house().sendKeys("House");
	   log.info("House name is entered");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.billing_postcode()));
	   Chout.billing_postcode().sendKeys("400101");
	   log.info("Pincode is entered");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.billing_city()));
	   Chout.billing_city().sendKeys("Mumbai");
	   log.info("City is added");
	   
	   Chout.State();
	   log.info("State is selected");
	   
	   wait.until(ExpectedConditions.visibilityOf(Chout.place_order()));
	   Chout.place_order().click();
	   log.info("Clicked on Place order button");
	   
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='razorpay-checkout-frame']")));
	   WebElement iframe1=driver.findElement(By.xpath("//*[@class='razorpay-checkout-frame']"));
		driver.switchTo().frame(iframe1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='merchant']")));
		
		boolean pg = driver.findElement(By.xpath("//*[@id='merchant']")).isDisplayed();
		if(pg) 
		{
			System.out.println("Razorpay is displayed");
			log.info("Razorpay is displayed");
		}else
		{
			System.out.println("Razorpay is not displayed");
			log.info("Razorpay is not displayed");
		}
		

    	
	   

}
	

}
