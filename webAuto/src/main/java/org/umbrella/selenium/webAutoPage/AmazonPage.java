package org.umbrella.selenium.webAutoPage;

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
	
	public WebElement shippingContinueButton;

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
	
	public void cursorOverOnCategory()
	{
		cursorOverOnElement(itemCateory);
	//	cursorOverOnElement(electronicsItemSelector);
	//	electronicsItemSelector.click();
		
	}
	

}
