package org.umbrella.selenium.webAutoTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.umbrella.selenium.webAutoPage.AmazonPage;

public class AmazonTest extends AmazonPage {
	
	SoftAssert softAssert = null;
	AmazonPage  amazonPage;
	

	@BeforeMethod
	public void beforeMethod() {
		softAssert = new SoftAssert();
		amazonPage = new AmazonPage();
	}
	
	@BeforeTest
	public void preRequest()	{  
		aDriver.get("https://www.amazon.in/");
		aDriver.manage().window().fullscreen();
	}
	

	@Test
	public void validatePurchaseFlow() throws InterruptedException {
		String oldTab = driver.getWindowHandle();	
		clickForLogin();
		softAssert.assertTrue(verifyLoginPage(),"After click on Account button no Navigation there for Login Page");
		enterEmialAddress("shubverma5@gmail.com");
		clickOncontinueButton();
		softAssert.assertTrue(verifyEnterEmialisExist(),"Enter email Address not valid");
		enterPassword("Shubham1.");
		clickOnLoginButton();
		cursorOverOnCategory();
		cursorOverOnSubCategory("TV, Appliances, Electronics");
		clickOnSubCategory("Headphones");
		headPhoneAddToCart();
		clickAmazonLink();
		searchInAmazon("Macbook pro"); 
		Thread.sleep(2000);
		selectSecondAvailProduct("MacBook Pro");
		selectProductQuntity("2");	
		clickOnAddToCart();
		clickOnCart();
			
	}
	
}
