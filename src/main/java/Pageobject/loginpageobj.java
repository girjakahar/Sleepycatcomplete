package Pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpageobj {
	WebDriver driver;
	By Email = By.cssSelector("input#login-email");
	By password = By.cssSelector("input#login-password");
	By submit = By.xpath("//button[@data-logindiv='LoginDiv']");
	By Newaccount = By.xpath("//span[text()=' Create new account ']");
	By forget = By.xpath("//span[text()=' Forgot password? ']");
	By forgetemail = By.xpath("//input[@id='forgot-password-email']");

	public loginpageobj(WebDriver driver) { //to provide life to driver in different test cases where this Landing page object is used we have added this method

		this.driver=driver; //this vaiable is created to give life to driver
	}
	
	public void switchingwindow()
	{
		Set<String> s1=driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> It= s1.iterator();
		String par = It.next();
		String child = It.next();
		driver.switchTo().window(child);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#login-email")));
	}
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}

	public WebElement password()
	{
		return driver.findElement(password);
	}

	public WebElement submit()
	{
		return driver.findElement(submit);
	}

	public WebElement Newaccount()
	{
		return driver.findElement(Newaccount);
	}

	public WebElement forget()
	{
		return driver.findElement(forget);
	}
	
	public WebElement forgetemail()
	{
		return driver.findElement(forgetemail);
	}

}
