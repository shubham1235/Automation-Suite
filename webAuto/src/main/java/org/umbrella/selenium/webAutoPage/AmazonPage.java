package org.umbrella.selenium.webAutoPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.umberella.Utils.BaseUtils;

public class AmazonPage extends BaseUtils {

	public WebDriver aDriver;

	@FindBy(id = "nav-link-accountList")
	public WebElement amazonAccountlink;

	@FindBy(xpath = "//*[contains(text(), 'Login')]")
	public WebElement LoginLabel;

	@FindBy(id = "ap_email")
	public WebElement emailTextBox;

	@FindBy(id = "continue")
	public WebElement continueButton;
	
	
	@FindBy(id = "ap_password")
	public WebElement passwordTextBox;
	
	@FindBy(id = "signInSubmit")
	public WebElement loginButton;
	
	@FindBy(id = "nav-shop")
	public WebElement itemCateory;
	
	@FindBy(xpath = "//*[contains(text(), 'TV, Appliances, Electronics')]")
	public WebElement electronicsItemSelector;
	
	@FindBy(className = "nav-logo-link")
	public WebElement amzonLogo;
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement topSearchBar;
	
	@FindBy(xpath = "//*[@id=quantity]")
	public WebElement quantityDropDown;
	

	public AmazonPage() {
		aDriver = driver;
		PageFactory.initElements(aDriver, this);
	}

	public void clickForLogin() {
		clickOnElement(amazonAccountlink);
	}

	public boolean verifyLoginPage() {
		return LoginLabel.isDisplayed();
	}

	public void enterEmialAddress(String emailAddress) {
		enterTextInTextBox(emailTextBox, emailAddress);
	}

	public void clickOncontinueButton() {
		clickOnElement(continueButton);
	}
	
	public boolean verifyEnterEmialisExist() {
		return loginButton.isDisplayed();
	}
	
	public void enterPassword(String password) {
		enterTextInTextBox(passwordTextBox, password);
	}
	
	public void clickOnLoginButton()
	{
		clickOnElement(loginButton);
	}
	
	public void cursorOverOnCategory() throws InterruptedException
	{
		cursorOverOnElement(itemCateory);
	}
	
	public void cursorOverOnSubCategory(String subCategory) throws InterruptedException
	{
		cursorOverOnElement(driver.findElement(By.xpath("//*[contains(text(), '"+subCategory+"')]")));
	}
	
	public void clickOnSubCategory(String subCategory) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[contains(text(), '"+subCategory+"')]")).click();
	}
	
	public void headPhoneAddToCart()
	{
		driver.findElement(By.xpath("//*[contains(text(), 'Add to Cart')]")).click();
	}
	
	public void clickAmazonLink()
	{
		clickOnElement(amzonLogo);
	}
	
	public void searchInAmazon(String searchItem)
	{
		enterTextInTextBox(topSearchBar, searchItem);
		topSearchBar.sendKeys(Keys.ENTER);
		
	}
	
	public void selectSecondAvailProduct() {
	
		aDriver.findElement(By.xpath("//div[contains(@class,'s-result-list s-search-results sg-row')]//span[contains(text(), 'MacBook Pro')]")).click();
		

	}
	
	public void selectProductQuntity(String quantity) {
		
		
		driver.findElement(By.xpath("//*[contains(text(), 'Quantity:')]//following-sibling::select")).click();
		aDriver.findElement(By.xpath("//*[contains(text(), '"+quantity+"')]")).click();
	}
	

}
