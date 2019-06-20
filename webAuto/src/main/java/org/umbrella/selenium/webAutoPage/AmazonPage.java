package org.umbrella.selenium.webAutoPage;

import java.security.spec.KeySpec;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	public WebElement amazonLogo;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement topSearchBar;

	@FindBy(id = "nav-cart")
	public WebElement cartButton;

	@FindBy(xpath = "//select[@name='quantity']")
	public WebElement quantityDrop;

	@FindBy(id = "//*[contains(text(), 'Add to Cart')]")
	public WebElement addToCartButton;

	@FindBy(id = "submit.add-to-cart")
	public WebElement addToCart;

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

	public void clickOnLoginButton() {
		WaitFor_visibilityOfElements(loginButton);
		clickOnElement(loginButton);
	}

	public void cursorOverOnCategory() throws InterruptedException {
		cursorOverOnElement(itemCateory);
	}

	public void cursorOverOnSubCategory(String subCategory) throws InterruptedException {
		WaitFor_visibilityOfElements(driver.findElement(By.xpath("//*[contains(text(), '" + subCategory + "')]")));
		cursorOverOnElement(driver.findElement(By.xpath("//*[contains(text(), '" + subCategory + "')]")));
	}

	public void clickOnSubCategory(String subCategory) throws InterruptedException {
		WaitFor_visibilityOfElements(driver.findElement(By.xpath("//*[contains(text(), '" + subCategory + "')]")));
		driver.findElement(By.xpath("//*[contains(text(), '" + subCategory + "')]")).click();
	}

	public void headPhoneAddToCart() {
		clickOnElement(driver.findElement(By.xpath("//*[contains(text(), 'Add to Cart')]")));
	}

	public void clickAmazonLink() {
		WaitFor_visibilityOfElements(amazonLogo);
		clickOnElement(amazonLogo);
	}

	public void searchInAmazon(String searchItem) {
		WaitFor_visibilityOfElements(topSearchBar);
		enterTextInTextBox(topSearchBar, searchItem);
		topSearchBar.sendKeys(Keys.ENTER);

	}

	public void selectSecondAvailProduct(String productName) {
	aDriver.findElement(By.xpath(
				"//div[contains(@class,'s-result-list s-search-results sg-row')]//span[contains(text(), '"+productName+"')]"))
				.click();

	}

	public void switchTab(int tabnumber) {
		ArrayList tabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) tabs.get(tabnumber));
	}

	public void clickOnCart() {
		WaitFor_visibilityOfElements(cartButton);
		clickOnElement(cartButton);
	}

	public void selectProductQuntity(String quantity) throws InterruptedException {

		switchTab(1);
		WaitFor_visibilityOfElements(quantityDrop);
		clickOnElement(quantityDrop);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//Option[@value='" + quantity + "']")).click();
		;
	}

	public void clickOnAddToCart() {
		WaitFor_visibilityOfElements(addToCart);
		clickOnElement(addToCart);
	}

}
