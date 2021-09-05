package Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class productdetailspage {
	
	static WebDriver driver;
	By Queen = By.xpath("//li[text()='Queen']");
	By Single = By.xpath("//li[text()='Single']");
	By Double = By.xpath("//li[text()='Double']");
	By King = By.xpath("//li[text()='King']");
	By Custom = By.xpath("//li[text()='Custom']");
	By inch = By.xpath("//Span[text()=' inch ']");
	By cm = By.xpath("//Span[text()=' cm ']");
	By feet = By.xpath("//Span[text()=' feet ']");
	By sizedropdown = By.xpath("//div[@Class='variations attr']");//div[contains(@class,'prRightPadding')]//li[14]
	//By size = By.xpath("//span[text()='75\" x 36\" x 6\"']");//div[@class='summary entry-summary']//div[1]//div[2]//div[1]//div[2]//ul[1]//li[3]
	By sizecm = By.xpath("//div[contains(@class,'prRightPadding')]//li[14]");//li[contains(@class,'noSliderDropDown active')]//span[contains(@class,'customselectedDataVal')][normalize-space()='190 x 152 x 15']
	
	
    public productdetailspage(WebDriver driver) { //to provide life to driver in different test cases where this Landing page object is used we have added this method
		
   	 this.driver=driver; //this vaiable is created to give life to driver
	}
    
     public void Scroll()
	  {
    	JavascriptExecutor Matt = (JavascriptExecutor)driver;
    	//WebElement scrollmatt = driver.findElement(By.xpath("//li[@class='noSliderDropDown active']//span[text()='190\" x 152\" x 15\"']"));
    	//List<WebElement> addsd  = driver.findElements(By.xpath("//button[text()='Add To Cart']"));
    	//WebElement add1 = addsd.get(0);
 		//Matt.executeScript("arguments[0].scrollIntoView();",scrollmatt );
    	Matt.executeScript("window.scrollBy(0,80)", "");
	   }
    
    
    public void Addtocart()
	  {
    	List<WebElement> add = driver.findElements(By.xpath("//button[text()='Add To Cart']"));			
        WebElement add1 = add.get(1);
        Actions cart = new Actions(driver);
        cart.moveToElement(add1).click(add1).build().perform();
	   }

	  public WebElement Queen()
	  {
      return driver.findElement(Queen);
	   }
	  public WebElement cm()
	  {
      return driver.findElement(cm);
	   }
	  public WebElement sizedropdown()
	  {
      return driver.findElement(sizedropdown);
	   }
	  public WebElement sizecm()
	  {
      return driver.findElement(sizecm);
	   }
	  

}
