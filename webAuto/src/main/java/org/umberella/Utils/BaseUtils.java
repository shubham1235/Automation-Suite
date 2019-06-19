package org.umberella.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtils {

	public WebDriver driver;
	JavascriptExecutor js;
	Actions actions;

	public BaseUtils() {
		driver = DriverInitialization.setDriverPath();
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
	}

	/**
	 * 
	 * @param element
	 * Wait For Element
	 */
	public void WaitFor_visibilityOfElements(WebElement element) {
		(new WebDriverWait(driver, 2)).until(ExpectedConditions.visibilityOf(element));
	}
}
