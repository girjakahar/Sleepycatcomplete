package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Basesleepy {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializedriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\user\\eclipse-workspaceNew\\Sleeycatcomplete\\src\\main\\java\\Resources\\data.properties");
		prop.load(fi);
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Document for selenium\\chromedriver.exe");
			List<Object> result = initiate1();
			driver = (WebDriver)result.get(0);
			//driver = new ChromeDriver();
		}
		else if(browsername=="firefox")
		{
			
		}
		else if(browsername=="IE")
		{
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	  public void getScreenShotPath(String testCaseName,WebDriver driver) throws IOException 
	  { 
		  TakesScreenshot ts=(TakesScreenshot) driver;//TakesScreenshot method is used to take screenshot in selenium 
		  File source=ts.getScreenshotAs(OutputType.FILE);//File in this step has info that wherethe screenshot is captured 
		  String destinationFile =System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";//to providepath where you need to store the screenshot 
		  FileUtils.copyFile(source,new File(destinationFile));//FileUtils is to copy the screenshot into your local machine from vertiual place source
	  
	  }
	 
	
	public synchronized static List<Object> initiate1(){
		List<Object> result = new ArrayList<Object>();
		Map < String, Object > contentSettings = new HashMap < String, Object > ();
		Map < String, Object > profile = new HashMap < String, Object > ();
		Map < String, Object > prefs = new HashMap < String, Object > ();
		ChromeOptions chromeOptions = new ChromeOptions();
		contentSettings.put("geolocation", 0);
	    profile.put("managed_default_content_settings", contentSettings);
	    prefs.put("profile", profile);
		chromeOptions.addArguments("--incognito");
		chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
		chromeOptions.addArguments("--disable-popup-blocking");
		chromeOptions.addArguments("--disable-geolocation");
		chromeOptions.setExperimentalOption("prefs", prefs);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver driver = new ChromeDriver(capabilities);
		result.add(driver);
		return result;

	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);//creating object of url which is coming from the website
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();//First creating the connection using url and then it will retrun the HttpURLConnection object
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
               System.out.println("link is working properly");
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
        	
        	System.out.println("link is broken  " +e);
           
        }
    } 
	

}


