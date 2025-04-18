package org.umberella.Utils;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
	}

	/**
	 * 
	 * @param element
	 * Wait For Element
	 */
	public void WaitFor_visibilityOfElements(WebElement element) {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * Click on Element
	 * @param element
	 */
	public void clickOnElement(WebElement element) {
		element.click();
	}
	
	
	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void enterTextInTextBox(WebElement element, String text) {
		element.sendKeys(text.trim());
	}
	
	/**
	 * cursor Over On Element and perform
	 * @param element
	 */
	public void cursorOverOnElement(WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}
	
	/**
	 * cursor Over On Element and Click
	 * @param element
	 * @throws InterruptedException
	 */
	public void cursorOverOnElementClick(WebElement element) throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		Thread.sleep(1000);
		actions.click();
		
		
	}
	
	
}
