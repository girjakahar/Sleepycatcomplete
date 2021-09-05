package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Checkoutpage {

	static WebDriver driver;
	
	By billing_first_name = By.name("billing_first_name");
	By billing_last_name = By.id("billing_last_name");
	By billing_email = By.id("billing_email");
	By billingphone = By.id("billing_phone");
	By noticheckbox = By.xpath("//label[@for='billing_whatsappfield']");
	By Contshipping = By.xpath("//a[text()='Continue to Shipping']");
	By house = By.id("billing_address_1");
	By street = By.id("billing_address_2");
	By billing_postcode = By.id("billing_postcode");
	By billing_city = By.id("billing_city");
	By place_order = By.id("place_order");


	public Checkoutpage(WebDriver driver) { //to provide life to driver in different test cases where this Landing page object is used we have added this method

		this.driver=driver; //this vaiable is created to give life to driver
	}

	public void State()
	{
		WebElement state = driver.findElement(By.id("billing_state"));
		Select drpstate = new Select(state);
		drpstate.selectByVisibleText("Maharashtra");
	}

	public WebElement billing_first_name()
	{
		return driver.findElement(billing_first_name);
	}
	public WebElement billing_last_name()
	{
		return driver.findElement(billing_last_name);
	}
	public WebElement billing_email()
	{
		return driver.findElement(billing_email);
	}
	public WebElement billingphone()
	{
		return driver.findElement(billingphone);
	}
	public WebElement noticheckbox()
	{
		return driver.findElement(noticheckbox);
	}
	public WebElement Contshipping()
	{
		return driver.findElement(Contshipping);
	}
	public WebElement house()
	{
		return driver.findElement(house);
	}
	public WebElement street()
	{
		return driver.findElement(street);
	}
	public WebElement billing_postcode()
	{
		return driver.findElement(billing_postcode);
	}
	public WebElement billing_city()
	{
		return driver.findElement(billing_city);
	}
	public WebElement place_order()
	{
		return driver.findElement(place_order);
	}



}


