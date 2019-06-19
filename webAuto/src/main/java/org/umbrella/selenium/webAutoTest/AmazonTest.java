package org.umbrella.selenium.webAutoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.umberella.Utils.BaseUtils;
import org.umbrella.selenium.webAutoPage.AmazonPage;

public class AmazonTest extends BaseUtils {
	
	SoftAssert softAssert = null;
	AmazonPage  amazonPage;
	
	
	@FindBy(id = "nav-logo")
	public WebElement AmazonLogo;
	
	@BeforeMethod
	public void beforeMethod() {
		//PageFactory.initElements(driver, this);
		driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
		softAssert = new SoftAssert();
		//amazonPage = new AmazonPage();
	}
	
	@BeforeTest
	public void preRequest()
	{  
		driver.get("https://www.amazon.in/");
	}
	
	
	@Test
	public void validatePurchaseFlow() {
		//amazonPage.waitforWebsiteloading();
	}

}
