package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Landingpage {

	static WebDriver driver;
	// Menu links
	By Login = By.xpath("//a[text()='Login']");
	By Mattress = By.xpath("//h3[text()=' Mattresses ']");
	By Bedding = By.xpath("//h3[text()=' Bedding ']");
	By Pillows = By.xpath("//h3[text()='Pillows']");
	By OhayoBed = By.xpath("//h3[text()=' Ohayo Bed ']");
	By headmenu = By.xpath("//a[text()='Original Mattress – 6 Inches']");
	By landtxt = By.xpath("//div[@class='desktop_header']//div[3]");
	
	By CartIcon = By.xpath("//li[@class='crticn']//a");
	
	public WebElement cartIcon() {
		return driver.findElement(CartIcon);
	}
		

	// Banner section xpath
	By firstbanner = By.xpath("//li[@class='slide-2 regular regular lslide active']//a");
	By Secondbanner = By.xpath("//div[@class='banner-desktop banner-bg-3']//div[@class='banner-desktop-svg']");
	By Thirdbanner = By.xpath("//li[@class='slide-5 regular regular lslide active']//a");
	By fourthbanner = By.xpath("//li[@class='slide-6 regular regular lslide active']//a");
	By nxtbanner = By.xpath("//div[@class='home-cover']//a[@class='lSNext']");
	By previousbanner = By.xpath("//div[@class='home-cover']//a[@class='lSPrev']");

	// sound sleep image section xpath
	By imgmattress = By.xpath("//img[@alt='Mattresses']");
	By imgbedding = By.xpath("//img[@alt='Bedding']");
	By imgpillow = By.xpath("//img[@alt='Pillows']");
	By imgohayobed = By.xpath("//img[@alt='Ohayo Bed']");

	// sound sleep text section xpath
	By txtmattress = By.xpath("//h3[text()=' Mattresses ']");
	By txtbedding = By.xpath("//h3[text()=' Bedding ']");
	By txtpillow = By.xpath("//h3[text()='Pillows']");
	By txtohayobed = By.xpath("//h3[text()=' Ohayo Bed ']");

	// sleepy cat banner
	By Brwbutton = By.xpath("//a[text()='Browse All Products']");

	// Shop from our bestsellers section links xpath for images
	By plusmattimg = By.xpath("//a[@href='/plus-mattress']//img[@class='vin-lazy-load']");
	By origmattimg = By.xpath("//a[@href='/original-mattress']//img[@class='vin-lazy-load']");
	By memfompillowimg = By.xpath("//a[@href='/pillow-memory-foam-pillow']//img[@class='vin-lazy-load']");
	By comforterimg = By.xpath("//a[@href='/comforter']//img[@class='vin-lazy-load']");

	// Shop from our bestsellers section links xpath for shop now button
	By plusmatttxt = By.xpath("//a[@href='/plus-mattress'][text()='Shop now']");
	By origmatttxt = By.xpath("//a[@href='/original-mattress'][normalize-space()='Shop now']");
	By memfompillowtxt = By.xpath("//a[@href='/pillow-memory-foam-pillow'][normalize-space()='Shop now']");
	By comfortertxt = By.xpath("//a[@href='/comforter'][normalize-space()='Shop now']");

	// Social media links on Homepage
	By Facebook = By.xpath("//i[@class='fab fa-facebook-square']");
	By Instagram = By.xpath("//i[@class='fab fa-instagram']");
	By Youtube = By.xpath("//i[@class='fab fa-youtube ']");
	By twitter = By.xpath("//i[@class='fab fa-twitter']");

	public Landingpage(WebDriver driver) { // to provide life to driver in different test cases where this Landing page
											// object is used we have added this method

		this.driver = driver; // this vaiable is created to give life to driver
	}

	//// Menu links
	public WebElement log() {
		return driver.findElement(Login);
	}

	public WebElement Mattress() {
		return driver.findElement(Mattress);
	}

	public WebElement Bedding() {
		return driver.findElement(Bedding);
	}

	public WebElement Pillows() {
		return driver.findElement(Pillows);
	}

	public WebElement OhayoBed() {
		return driver.findElement(OhayoBed);
	}

	public WebElement headmenu() {
		return driver.findElement(headmenu);
	}

	public WebElement landtxt() {
		return driver.findElement(landtxt);
	}

	// banner section
	public WebElement firstbanner() {
		return driver.findElement(firstbanner);
	}

	public WebElement Secondbanner() {
		return driver.findElement(Secondbanner);
	}

	public WebElement Thirdbanner() {
		return driver.findElement(Thirdbanner);
	}

	public WebElement fourthbanner() {
		return driver.findElement(fourthbanner);
	}

	public WebElement nxtbanner() {
		return driver.findElement(nxtbanner);
	}

	public WebElement previousbanner() {
		return driver.findElement(previousbanner);
	}

	// sound sleep image section xpath
	public WebElement imgmattress() {
		return driver.findElement(imgmattress);
	}

	public WebElement imgbedding() {
		return driver.findElement(imgbedding);
	}

	public WebElement imgpillow() {
		return driver.findElement(imgpillow);
	}

	public WebElement imgohayobed() {
		return driver.findElement(imgohayobed);
	}

	// Sound sleep text section
	public WebElement txtmattress() {
		return driver.findElement(txtmattress);
	}

	public WebElement txtbedding() {
		return driver.findElement(txtbedding);
	}

	public WebElement txtpillow() {
		return driver.findElement(txtpillow);
	}

	public WebElement txtohayobed() {
		return driver.findElement(txtohayobed);
	}

	// sleepy cat banner
	public WebElement Brwbutton() {
		return driver.findElement(Brwbutton);
	}

	// Shop from our bestsellers section links xpath for images
	public WebElement plusmattimg() {
		return driver.findElement(plusmattimg);
	}

	public WebElement origmattimg() {
		return driver.findElement(origmattimg);
	}

	public WebElement memfompillowimg() {
		return driver.findElement(memfompillowimg);
	}

	public WebElement comforterimg() {
		return driver.findElement(comforterimg);
	}

	// Shop from our bestsellers section links xpath for text
	public WebElement plusmatttxt() {
		return driver.findElement(plusmatttxt);
	}

	public WebElement origmatttxt() {
		return driver.findElement(origmatttxt);
	}

	public WebElement memfompillowtxt() {
		return driver.findElement(memfompillowtxt);
	}

	public WebElement comfortertxt() {
		return driver.findElement(comfortertxt);
	}

	//// Social media links on Homepage
	public WebElement Facebook() {
		return driver.findElement(Facebook);
	}

	public WebElement Instagram() {
		return driver.findElement(Instagram);
	}

	public WebElement Youtube() {
		return driver.findElement(Youtube);
	}

	public WebElement twitter() {
		return driver.findElement(twitter);
	}

	public void maattheader() {
		WebElement scrollmatt = driver.findElement(By.xpath("//a[text()='Mattress']"));
		// WebElement mattresschild = driver.findElement(By.xpath("//a[text()='Original
		// Mattress – 6 Inches']"));
		Actions hovermenu = new Actions(driver);
		hovermenu.moveToElement(scrollmatt).build().perform();

	}

	public void modal() throws Exception {
		try { // get upto 30% modal
			driver.findElement(By.xpath("//*[@class='soundest-form-without-image-close ']")).click();
		} catch (Exception e) {
			System.out.println("Model 1 error :" + e);
		}
		try { // liked what you saw
			driver.findElement(By.xpath("//*[@class='soundest-form-without-image-close ']")).click();
		} catch (Exception e) {
			System.out.println("Model 2 error :" + e);
		}

	}

}
