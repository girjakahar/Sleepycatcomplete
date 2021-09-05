package Testsleepy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.CartPageObjectTest;
import Pageobject.Landingpage;
import Pageobject.productdetailspage;
import Resources.Basesleepy;

public class CartSliderTest extends Basesleepy {
	
	static WebDriver driver;
	static WebDriverWait wait;
	public static Logger log =LogManager.getLogger(Basesleepy.class.getName());
	
	@BeforeTest
	public void logi() throws IOException
	{
	   driver=initializedriver();
	}
	
	@Test
	public void cartSliderTest() throws Exception
	{
    	
	   driver.get(prop.getProperty("url"));
       log.info("Website opened Successfully");
    
	   driver.manage().window().maximize();
	   log.info("Website is maximized");
	   
	   wait = new WebDriverWait(driver, 20);
	   Landingpage landingPage = new Landingpage(driver);
	   landingPage.modal();
	   log.info("Offer modal is closed");

	   CartPageObjectTest cart = new CartPageObjectTest(driver);
	   wait.until(ExpectedConditions.visibilityOf(landingPage.cartIcon()));
	   landingPage.cartIcon().click();
	   log.info("Clicked on Cart icon");
	   
	   wait.until(ExpectedConditions.visibilityOf(cart.addtocartSingleComforter()));
	   cart.addtocartSingleComforter().click();
	   log.info("Click on Add to cart button for single comforter");
	   
	   wait.until(ExpectedConditions.visibilityOf(cart.incrementQuantity()));
	   cart.incrementQuantity().click();
	   log.info("Increment product quantity");

	   cart.decreseQuantity().click();
	   log.info("Decrese quantity by one");

	   cart.removeProduct().click();
	   log.info("Clicked on remove product icon from cart slider ");

	   

}
}
 
 