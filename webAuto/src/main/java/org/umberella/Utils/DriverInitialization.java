package org.umberella.Utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class DriverInitialization {

		
	public static ChromeDriver setDriverPath() {

		if (OSValidation.isMac()) {
			System.out.println("Operation System :- Mac OS");
			System.setProperty("webdriver.chrome.driver", "browserdriver/chromedriver");
			
		}
		if (OSValidation.isWindows()) {
			System.out.println("Operation System :- Windows OS");
			System.setProperty("webdriver.chrome.driver", "browserdriver/chromedriver.exe");
		}
		if (OSValidation.isUnix()) {
			System.out.println("Operation System :- Unix OS");
			System.setProperty("webdriver.chrome.driver", "browserdriver/chromedriver_linux");
		}
	
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", prefs);
		options.addArguments("start-maximized");

		ChromeDriver driver = new ChromeDriver(options);

		return driver;
	}
}
