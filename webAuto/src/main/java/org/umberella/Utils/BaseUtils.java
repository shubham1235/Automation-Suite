package org.umberella.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseUtils {

	public WebDriver driver;
	JavascriptExecutor js;
	Actions actions;

	public BaseUtils() {
		driver = DriverInitialization.setDriverPath();
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
	}

}
