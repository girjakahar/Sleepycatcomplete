package Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.DesiredCapabilities;

public class chromecapa {
	
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
		return result;

	}
	
}
